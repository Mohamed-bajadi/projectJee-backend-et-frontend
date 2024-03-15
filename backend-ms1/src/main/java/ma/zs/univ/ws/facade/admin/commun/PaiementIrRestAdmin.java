package  ma.zs.univ.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.commun.PaiementIr;
import ma.zs.univ.dao.criteria.core.commun.PaiementIrCriteria;
import ma.zs.univ.service.facade.admin.commun.PaiementIrAdminService;
import ma.zs.univ.ws.converter.commun.PaiementIrConverter;
import ma.zs.univ.ws.dto.commun.PaiementIrDto;
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
@RequestMapping("/api/admin/paiementIr/")
public class PaiementIrRestAdmin  extends AbstractController<PaiementIr, PaiementIrDto, PaiementIrCriteria, PaiementIrAdminService, PaiementIrConverter> {



    @Operation(summary = "upload one paiementIr")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple paiementIrs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all paiementIrs")
    @GetMapping("")
    public ResponseEntity<List<PaiementIrDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  paiementIr")
    @PostMapping("")
    public ResponseEntity<PaiementIrDto> save(@RequestBody PaiementIrDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  paiementIr")
    @PutMapping("")
    public ResponseEntity<PaiementIrDto> update(@RequestBody PaiementIrDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of paiementIr")
    @PostMapping("multiple")
    public ResponseEntity<List<PaiementIrDto>> delete(@RequestBody List<PaiementIrDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified paiementIr")
    @DeleteMapping("")
    public ResponseEntity<PaiementIrDto> delete(@RequestBody PaiementIrDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified paiementIr")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple paiementIrs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by societe id")
    @GetMapping("societe/id/{id}")
    public List<PaiementIrDto> findBySocieteId(@PathVariable Long id){
        return findDtos(service.findBySocieteId(id));
    }
    @Operation(summary = "delete by societe id")
    @DeleteMapping("societe/id/{id}")
    public int deleteBySocieteId(@PathVariable Long id){
        return service.deleteBySocieteId(id);
    }

    @Operation(summary = "Finds a paiementIr and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PaiementIrDto> findById(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @Operation(summary = "Finds paiementIrs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PaiementIrDto>> findByCriteria(@RequestBody PaiementIrCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated paiementIrs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PaiementIrCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports paiementIrs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PaiementIrCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets paiementIr data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PaiementIrCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public PaiementIrRestAdmin (PaiementIrAdminService service, PaiementIrConverter converter) {
        super(service, converter);
    }




}
