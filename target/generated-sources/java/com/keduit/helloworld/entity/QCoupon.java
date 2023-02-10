package com.keduit.helloworld.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCoupon is a Querydsl query type for Coupon
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoupon extends EntityPathBase<Coupon> {

    private static final long serialVersionUID = -1234075154L;

    public static final QCoupon coupon = new QCoupon("coupon");

    public final NumberPath<Long> couponbool = createNumber("couponbool", Long.class);

    public final NumberPath<Long> couponNum = createNumber("couponNum", Long.class);

    public final NumberPath<Long> couponvalue = createNumber("couponvalue", Long.class);

    public final StringPath serialnum = createString("serialnum");

    public QCoupon(String variable) {
        super(Coupon.class, forVariable(variable));
    }

    public QCoupon(Path<? extends Coupon> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoupon(PathMetadata metadata) {
        super(Coupon.class, metadata);
    }

}
