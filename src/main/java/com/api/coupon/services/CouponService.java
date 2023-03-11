package com.api.coupon.services;

import com.api.coupon.entities.CouponEntity;
import com.api.coupon.repositories.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;

    public CouponEntity getById(Long id) {
        return couponRepository.findById(id).get();
    }

    public CouponEntity addCoupon(CouponEntity couponEntity) {
        return couponRepository.save(couponEntity);
    }

    public void deleteCoupon(Long id) {
        couponRepository.deleteById(id);
    }

    public CouponEntity updateCoupon(CouponEntity couponEntity) {
        return couponRepository.save(couponEntity);
    }

    public Iterable<CouponEntity> getAllCoupons() {
        return couponRepository.findAll();
    }
}
