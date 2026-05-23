package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;
import com.devwmu.dc_fin_soft.repositories.SourceRepository;
import com.devwmu.dc_fin_soft.entities.Source;
import java.util.Optional;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/sources")
public class SourceController {
    private final SourceRepository sourceRepository;

    public SourceController(final SourceRepository sourceRepository) {
    this.sourceRepository = sourceRepository;
  }
    @GetMapping("/sources")
    public Iterable<Source> getAllSources() {   
        //      OUTPUT: all of the sources

        return this.sourceRepository.findAll();
    }

    @GetMapping("/sources/search")
    public Source filterSources(@RequestParam String[] filterArray) {
        // custom
        // filterSources(filterArray[]) ?
        //      Take an array of column names and desired values, and output the selected SQL rows
        //      OUTPUT: sources

        return new Source();
    }

    @PostMapping("/source")
    public Source createSource(@RequestBody Source source){
        return this.sourceRepository.save(source);
        // createSource(name, cap, type, internal): bool
        //     Adds a source to the source database
        //     OUTPUT: created source
    }

    @PutMapping("/source/edit_{id}")
    public Source editSource(@PathVariable("id") Integer id, @RequestBody Source source){
        // editSource((id, editArray[]): bool
        //     Edits columns of a source
        //     OUTPUT: edited source
        Optional<Source> sourceToUpdateOptional = this.sourceRepository.findById(id);
        if (!sourceToUpdateOptional.isPresent()){
            return null;
        }

        Source sourceToUpdate = sourceToUpdateOptional.get();
        if (source.getName() != null){
            sourceToUpdate.setName(source.getName());
        }
        if (source.getType() != null){
            sourceToUpdate.setType(source.getType());
        }
        if (source.getInternal() != null){
            sourceToUpdate.setInternal(source.getInternal());
        }
        if (source.getMoneyCap() != null){
            sourceToUpdate.setMoneyCap(source.getMoneyCap());
        }
        if (source.getSpent() != null){
            sourceToUpdate.setSpent(source.getSpent());
        }
        if (source.getBudgeted() != null){
            sourceToUpdate.setBudgeted(source.getBudgeted());
        }
        if (source.getAvailable() != null){
            sourceToUpdate.setAvailable(source.getAvailable());
        }
        if (source.getDeleted() != null){
            sourceToUpdate.setDeleted(source.getDeleted());
        }
        
        return this.sourceRepository.save(sourceToUpdate);

    }

    @PutMapping("/source/delete_{id}")
    public Source deleteSource(@PathVariable("id") Integer id){
        // deleteSource(sourceID): bool
        //     Deletes a source from the database
        //     OUTPUT: deleted source

        Optional<Source> sourceToDeleteOptional = this.sourceRepository.findById(id);
        if (!sourceToDeleteOptional.isPresent()){
            return null;
        }
        Source source = sourceToDeleteOptional.get();
        source.setDeleted(1);

        
        return this.sourceRepository.save(source);
    }
}
