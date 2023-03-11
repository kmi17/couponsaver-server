package com.api.coupon.repositories;

import com.api.coupon.entities.CouponEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends CrudRepository<CouponEntity, Long> {

}
