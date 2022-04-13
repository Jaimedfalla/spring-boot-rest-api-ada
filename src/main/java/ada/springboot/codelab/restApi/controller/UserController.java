package ada.springboot.codelab.restApi.controller;

import ada.springboot.codelab.restApi.data.User;
import ada.springboot.codelab.restApi.dto.UserDto;
import ada.springboot.codelab.restApi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final IUserService service;

    public UserController(@Autowired IUserService service){
        this.service=service;
    }

    @GetMapping
    public ResponseEntity<List<User>> aal(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id){
        return null;
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDto user){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@RequestBody UserDto user,@PathVariable String id){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id){
        return null;
    }
}
