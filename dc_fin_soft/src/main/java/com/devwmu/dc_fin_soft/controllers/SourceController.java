package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;
import com.devwmu.dc_fin_soft.repositories.SourceRepository;
import com.devwmu.dc_fin_soft.entities.Source;


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
        // filterSources(filterArray[]) ?
        //      Take an array of column names and desired values, and output the selected SQL rows
        //      OUTPUT: sources

        return new Source();
    }

    @PostMapping("/source")
    public Source createSource(){
        // createSource(name, cap, type, internal): bool
        //     Adds a source to the source database
        //     OUTPUT: success or not

        return new Source();
    }

    @PutMapping("/source/edit_{id}")
    public Source editSource(){
        // editSource((id, editArray[]): bool
        //     Edits columns of a source
        //     OUTPUT: success or not

        return new Source();
    }

    @DeleteMapping("/source/delete_{id}")
    public Source deleteSource(){
        // deleteSource(sourceID): bool
        //     Deletes a source from the database
        //     OUTPUT: success or not

        return new Source();
    }
}
