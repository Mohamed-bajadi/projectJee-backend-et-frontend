package  ma.zs.univ.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.commun.TauxIr;
import ma.zs.univ.dao.criteria.core.commun.TauxIrCriteria;
import ma.zs.univ.service.facade.admin.commun.TauxIrAdminService;
import ma.zs.univ.ws.converter.commun.TauxIrConverter;
import ma.zs.univ.ws.dto.commun.TauxIrDto;
import ma.zs.univ.zynerator.controller.AbstractController;
import ma.zs.univ.zynerator.dto.AuditEntityDto;
import ma.zs.univ.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zs.univ.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.univ.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/tauxIr/")
public class TauxIrRestAdmin  extends AbstractController<TauxIr, TauxIrDto, TauxIrCriteria, TauxIrAdminService, TauxIrConverter> {



    @Operation(summary = "upload one tauxIr")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple tauxIrs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all tauxIrs")
    @GetMapping("")
    public ResponseEntity<List<TauxIrDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  tauxIr")
    @PostMapping("")
    public ResponseEntity<TauxIrDto> save(@RequestBody TauxIrDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  tauxIr")
    @PutMapping("")
    public ResponseEntity<TauxIrDto> update(@RequestBody TauxIrDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of tauxIr")
    @PostMapping("multiple")
    public ResponseEntity<List<TauxIrDto>> delete(@RequestBody List<TauxIrDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified tauxIr")
    @DeleteMapping("")
    public ResponseEntity<TauxIrDto> delete(@RequestBody TauxIrDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified tauxIr")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple tauxIrs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }



    @Operation(summary = "Finds a tauxIr and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TauxIrDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds tauxIrs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TauxIrDto>> findByCriteria(@RequestBody TauxIrCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated tauxIrs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TauxIrCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports tauxIrs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TauxIrCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets tauxIr data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TauxIrCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TauxIrRestAdmin (TauxIrAdminService service, TauxIrConverter converter) {
        super(service, converter);
    }




}
