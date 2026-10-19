package com.github.mikephil.charting.utils;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MPPointD extends ObjectPool.Poolable {
    private static ObjectPool<MPPointD> pool;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f25202x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f25203y;

    static {
        ObjectPool<MPPointD> objectPoolCreate = ObjectPool.create(64, new MPPointD(0.0d, 0.0d));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
    }

    private MPPointD(double d10, double d11) {
        this.f25202x = d10;
        this.f25203y = d11;
    }

    public static MPPointD getInstance(double d10, double d11) {
        MPPointD mPPointD = (MPPointD) pool.get();
        mPPointD.f25202x = d10;
        mPPointD.f25203y = d11;
        return mPPointD;
    }

    public static void recycleInstance(MPPointD mPPointD) {
        pool.recycle(mPPointD);
    }

    public static void recycleInstances(List<MPPointD> list) {
        pool.recycle(list);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new MPPointD(0.0d, 0.0d);
    }

    public String toString() {
        return "MPPointD, x: " + this.f25202x + ", y: " + this.f25203y;
    }
}
