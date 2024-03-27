package ma.zs.univ.ws.facade.admin.commun;


import io.swagger.v3.oas.annotations.Operation;
import ma.zs.univ.bean.core.commun.EmployeSalaireHistory;
import ma.zs.univ.dao.criteria.core.commun.EmployeSalaireHistoryCriteria;
import ma.zs.univ.service.facade.admin.commun.EmployeSalaireHistoryAdminService;
import ma.zs.univ.ws.converter.commun.EmployeSalaireHistoryConverter;
import ma.zs.univ.ws.dto.commun.EmployeSalaireHistoryDto;
import ma.zs.univ.zynerator.controller.AbstractController;
import ma.zs.univ.zynerator.dto.FileTempDto;
import ma.zs.univ.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/admin/EmployeSalaireHistory")
public class EmployeSalaireHistoryRestAdmin extends AbstractController<EmployeSalaireHistory, EmployeSalaireHistoryDto, EmployeSalaireHistoryCriteria, EmployeSalaireHistoryAdminService, EmployeSalaireHistoryConverter> {


    public EmployeSalaireHistoryRestAdmin(EmployeSalaireHistoryAdminService service, EmployeSalaireHistoryConverter converter) {
        super(service, converter);
    }

    @Operation(summary = "upload one EmployeSalaireHistory")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple EmployeSalaireHistory")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all EmployeSalaireHistory")
    @GetMapping("")
    public ResponseEntity<List<EmployeSalaireHistoryDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  EmployeSalaireHistory")
    @PostMapping("")
    public ResponseEntity<EmployeSalaireHistoryDto> save(@RequestBody EmployeSalaireHistoryDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  EmployeSalaireHistory")
    @PutMapping("")
    public ResponseEntity<EmployeSalaireHistoryDto> update(@RequestBody EmployeSalaireHistoryDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of EmployeSalaireHistory")
    @PostMapping("multiple")
    public ResponseEntity<List<EmployeSalaireHistoryDto>> delete(@RequestBody List<EmployeSalaireHistoryDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified EmployeSalaireHistory")
    @DeleteMapping("")
    public ResponseEntity<EmployeSalaireHistoryDto> delete(@RequestBody EmployeSalaireHistoryDto dto) throws Exception {
        return super.delete(dto);
    }

    @Operation(summary = "Delete the specified EmployeSalaireHistory")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple EmployeSalaireHistorys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }


    @Operation(summary = "find by societe id")
    @GetMapping("societe/id/{id}")
    public List<EmployeSalaireHistoryDto> findBySocieteId(@PathVariable Long id){
        return findDtos(service.findBySocieteId(id));
    }
    @Operation(summary = "delete by societe id")
    @DeleteMapping("societe/id/{id}")
    public int deleteBySocieteId(@PathVariable Long id){
        return service.deleteBySocieteId(id);
    }

    @Operation(summary = "Finds a EmployeSalaireHistory and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EmployeSalaireHistoryDto> findById(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @Operation(summary = "Finds EmployeSalaireHistorys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EmployeSalaireHistoryDto>> findByCriteria(@RequestBody EmployeSalaireHistoryCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated EmployeSalaireHistorys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EmployeSalaireHistoryCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports EmployeSalaireHistorys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EmployeSalaireHistoryCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets EmployeSalaireHistory data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EmployeSalaireHistoryCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



}
