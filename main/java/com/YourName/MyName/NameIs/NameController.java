package com.YourName.MyName.NameIs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
@GetMapping("/Name")
public String name()
{
    return "Hello team! My Name is Neeraj Kushwaha";
}
}
