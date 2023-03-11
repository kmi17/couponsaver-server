package com.api.coupon.controllers;

import com.api.coupon.entities.CouponEntity;
import com.api.coupon.services.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/coupons")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/{id}")
    public CouponEntity getCouponById(@PathVariable Long id) {
        return couponService.getById(id);
    }

    @PostMapping()
    @Consumes("application/json")
    public CouponEntity addCoupon(@RequestBody CouponEntity couponEntity) {
        return couponService.addCoupon(couponEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteCoupon(@PathVariable Long id){
        couponService.deleteCoupon(id);
    }

    @PutMapping()
    public CouponEntity updateCoupon(@RequestBody CouponEntity couponEntity) {
        return couponService.updateCoupon(couponEntity);
    }

    @GetMapping()
    public Iterable<CouponEntity> getAllCoupons() {
        return couponService.getAllCoupons();
    }
}
