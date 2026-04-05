package com.devwmu.dc_fin_soft.admin.sources;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/admin/sources")
public class SourceController {
    @PostMapping("/create_source")
    public CreateSource createSource(){
        // createSource(name, cap, type, internal): bool
        //     Adds a source to the source database
        //     OUTPUT: success or not

        return new CreateSource();
    }

    @PutMapping("/edit_source")
    public EditSource editSource(){
        // editSource((id, editArray[]): bool
        //     Edits columns of a source
        //     OUTPUT: success or not

        return new EditSource();
    }

    @DeleteMapping("/delete_source")
    public DeleteSource deleteSource(){
        // deleteSource(sourceID): bool
        //     Deletes a source from the database
        //     OUTPUT: success or not

        return new DeleteSource();
    }
}
