package xyz.chrishspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Descriiption
 * @Author www.zzjava.xyz
 * @Date 2019/10/13 16:19
 */
@Controller
public class HelloController {
    @GetMapping("/")
    public String index() { return "index"; }
}
