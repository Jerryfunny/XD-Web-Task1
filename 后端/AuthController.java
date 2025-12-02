@RestController
@RequestMapping("/api/auth")
public class AuthController {
@PostMapping("/login") public ResponseEntity<?> login(@RequestBody LoginDto dto){ /* 返回 JWT */ }
@PostMapping("/register") public ResponseEntity<?> register(@RequestBody RegisterDto dto){ }
}
