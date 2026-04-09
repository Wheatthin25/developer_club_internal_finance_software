package com.devwmu.dc_fin_soft.admin.sources;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/sources")
public class SourceController {
    @PostMapping("/source")
    public CreateSource createSource(){
        // createSource(name, cap, type, internal): bool
        //     Adds a source to the source database
        //     OUTPUT: success or not

        return new CreateSource();
    }

    @PutMapping("/source/{id}")
    public EditSource editSource(){
        // editSource((id, editArray[]): bool
        //     Edits columns of a source
        //     OUTPUT: success or not

        return new EditSource();
    }

    @DeleteMapping("/source/{id}")
    public DeleteSource deleteSource(){
        // deleteSource(sourceID): bool
        //     Deletes a source from the database
        //     OUTPUT: success or not

        return new DeleteSource();
    }
}
