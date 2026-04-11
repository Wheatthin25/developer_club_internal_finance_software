package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Source;


// Fix outputs and inputs

@RestController
@RequestMapping("/admin/sources")
public class SourceController {
    @PostMapping("/source")
    public Source createSource(){
        // createSource(name, cap, type, internal): bool
        //     Adds a source to the source database
        //     OUTPUT: success or not

        return new Source();
    }

    @PutMapping("/source/{id}")
    public Source editSource(){
        // editSource((id, editArray[]): bool
        //     Edits columns of a source
        //     OUTPUT: success or not

        return new Source();
    }

    @DeleteMapping("/source/{id}")
    public Source deleteSource(){
        // deleteSource(sourceID): bool
        //     Deletes a source from the database
        //     OUTPUT: success or not

        return new Source();
    }
}
