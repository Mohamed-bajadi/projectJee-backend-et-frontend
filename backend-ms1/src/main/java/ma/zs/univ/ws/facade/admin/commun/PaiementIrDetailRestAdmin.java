package  ma.zs.univ.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.commun.PaiementIrDetail;
import ma.zs.univ.dao.criteria.core.commun.PaiementIrDetailCriteria;
import ma.zs.univ.service.facade.admin.commun.PaiementIrDetailAdminService;
import ma.zs.univ.ws.converter.commun.PaiementIrDetailConverter;
import ma.zs.univ.ws.dto.commun.PaiementIrDetailDto;
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
@RequestMapping("/api/admin/paiementIrDetail/")
public class PaiementIrDetailRestAdmin  extends AbstractController<PaiementIrDetail, PaiementIrDetailDto, PaiementIrDetailCriteria, PaiementIrDetailAdminService, PaiementIrDetailConverter> {



    @Operation(summary = "upload one paiementIrDetail")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple paiementIrDetails")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all paiementIrDetails")
    @GetMapping("")
    public ResponseEntity<List<PaiementIrDetailDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  paiementIrDetail")
    @PostMapping("")
    public ResponseEntity<PaiementIrDetailDto> save(@RequestBody PaiementIrDetailDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  paiementIrDetail")
    @PutMapping("")
    public ResponseEntity<PaiementIrDetailDto> update(@RequestBody PaiementIrDetailDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of paiementIrDetail")
    @PostMapping("multiple")
    public ResponseEntity<List<PaiementIrDetailDto>> delete(@RequestBody List<PaiementIrDetailDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified paiementIrDetail")
    @DeleteMapping("")
    public ResponseEntity<PaiementIrDetailDto> delete(@RequestBody PaiementIrDetailDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified paiementIrDetail")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple paiementIrDetails by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by paiementIr id")
    @GetMapping("paiementIr/id/{id}")
    public List<PaiementIrDetailDto> findByPaiementIrId(@PathVariable Long id){
        return findDtos(service.findByPaiementIrId(id));
    }
    @Operation(summary = "delete by paiementIr id")
    @DeleteMapping("paiementIr/id/{id}")
    public int deleteByPaiementIrId(@PathVariable Long id){
        return service.deleteByPaiementIrId(id);
    }
    @Operation(summary = "find by tauxIr id")
    @GetMapping("tauxIr/id/{id}")
    public List<PaiementIrDetailDto> findByTauxIrId(@PathVariable Long id){
        return findDtos(service.findByTauxIrId(id));
    }
    @Operation(summary = "delete by tauxIr id")
    @DeleteMapping("tauxIr/id/{id}")
    public int deleteByTauxIrId(@PathVariable Long id){
        return service.deleteByTauxIrId(id);
    }

    @Operation(summary = "Finds a paiementIrDetail and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PaiementIrDetailDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds paiementIrDetails by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PaiementIrDetailDto>> findByCriteria(@RequestBody PaiementIrDetailCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated paiementIrDetails by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PaiementIrDetailCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports paiementIrDetails by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PaiementIrDetailCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets paiementIrDetail data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PaiementIrDetailCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public PaiementIrDetailRestAdmin (PaiementIrDetailAdminService service, PaiementIrDetailConverter converter) {
        super(service, converter);
    }




}
