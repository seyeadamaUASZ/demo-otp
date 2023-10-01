package com.sid.gl.demootp;

import io.github.seyeadamaUASZ.service.OTPConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoOtpController {

    private OTPConfiguration otpConfiguration;

    public DemoOtpController(OTPConfiguration otpConfiguration) {
        this.otpConfiguration = otpConfiguration;
    }

    @GetMapping("/generate")
    public String generateOTP(){
        String code = otpConfiguration.generateCodeOtp("NUMBER","MINUTE",1,4);
        return code;
    }

    @GetMapping("/verify/{code}")
    public boolean verifycode(@PathVariable("code") String code)  {
            return otpConfiguration.verifyCode(code);

    }
}
