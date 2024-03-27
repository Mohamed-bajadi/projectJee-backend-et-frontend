package ma.zs.univ.ws.facade.admin.commun;


import io.swagger.v3.oas.annotations.Operation;
import ma.zs.univ.bean.core.commun.Employe;
import ma.zs.univ.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.univ.service.facade.admin.commun.EmployeAdminService;
import ma.zs.univ.ws.converter.commun.EmployeConverter;
import ma.zs.univ.ws.dto.commun.EmployeDto;
import ma.zs.univ.zynerator.controller.AbstractController;
import ma.zs.univ.zynerator.dto.FileTempDto;
import ma.zs.univ.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/admin/employe")
public class EmployeRestAdmin extends AbstractController<Employe, EmployeDto, EmployeCriteria, EmployeAdminService, EmployeConverter> {


    @Operation(summary = "upload one Employe")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple Employe")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all Employe")
    @GetMapping("")
    public ResponseEntity<List<EmployeDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  Employe")
    @PostMapping("")
    public ResponseEntity<EmployeDto> save(@RequestBody EmployeDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  Employe")
    @PutMapping("")
    public ResponseEntity<EmployeDto> update(@RequestBody EmployeDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of Employe")
    @PostMapping("multiple")
    public ResponseEntity<List<EmployeDto>> delete(@RequestBody List<EmployeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified Employe")
    @DeleteMapping("")
    public ResponseEntity<EmployeDto> delete(@RequestBody EmployeDto dto) throws Exception {
        return super.delete(dto);
    }

    @Operation(summary = "Delete the specified Employe")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple Employes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }


    @Operation(summary = "find by societe id")
    @GetMapping("societe/id/{id}")
    public List<EmployeDto> findBySocieteId(@PathVariable Long id){
        return findDtos(service.findBySocieteId(id));
    }
    @Operation(summary = "delete by societe id")
    @DeleteMapping("societe/id/{id}")
    public int deleteBySocieteId(@PathVariable Long id){
        return service.deleteBySocieteId(id);
    }

    @Operation(summary = "Finds a Employe and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EmployeDto> findById(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @Operation(summary = "Finds Employes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EmployeDto>> findByCriteria(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated Employes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports Employes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets Employe data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    public EmployeRestAdmin(EmployeAdminService service, EmployeConverter converter) {
        super(service, converter);
    }
}
