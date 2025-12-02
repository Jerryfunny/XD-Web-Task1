@RestController
@RequestMapping("/api/docs")
public class DocumentController {
@PostMapping("/upload")
public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file, Principal p){
// 校验、存储到 files.upload-dir，保存 Document 实体
}


@GetMapping("/download/{id}")
public ResponseEntity<Resource> download(@PathVariable Long id, Principal p){ }


@GetMapping("/preview/{id}")
public ResponseEntity<?> preview(@PathVariable Long id){
// 若为 PDF，可直接返回 file URL 或 byte range
}
}
