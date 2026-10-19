package com.github.mikephil.charting.utils;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MPPointF extends ObjectPool.Poolable {
    public static final Parcelable.Creator<MPPointF> CREATOR;
    private static ObjectPool<MPPointF> pool;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f25204x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f25205y;

    static {
        ObjectPool<MPPointF> objectPoolCreate = ObjectPool.create(32, new MPPointF(0.0f, 0.0f));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
        CREATOR = new Parcelable.Creator<MPPointF>() { // from class: com.github.mikephil.charting.utils.MPPointF.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MPPointF createFromParcel(Parcel parcel) {
                MPPointF mPPointF = new MPPointF(0.0f, 0.0f);
                mPPointF.my_readFromParcel(parcel);
                return mPPointF;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MPPointF[] newArray(int i10) {
                return new MPPointF[i10];
            }
        };
    }

    public MPPointF() {
    }

    public static MPPointF getInstance(float f10, float f11) {
        MPPointF mPPointF = (MPPointF) pool.get();
        mPPointF.f25204x = f10;
        mPPointF.f25205y = f11;
        return mPPointF;
    }

    public static void recycleInstance(MPPointF mPPointF) {
        pool.recycle(mPPointF);
    }

    public static void recycleInstances(List<MPPointF> list) {
        pool.recycle(list);
    }

    public float getX() {
        return this.f25204x;
    }

    public float getY() {
        return this.f25205y;
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new MPPointF(0.0f, 0.0f);
    }

    public void my_readFromParcel(Parcel parcel) {
        this.f25204x = parcel.readFloat();
        this.f25205y = parcel.readFloat();
    }

    public MPPointF(float f10, float f11) {
        this.f25204x = f10;
        this.f25205y = f11;
    }

    public static MPPointF getInstance() {
        return (MPPointF) pool.get();
    }

    public static MPPointF getInstance(MPPointF mPPointF) {
        MPPointF mPPointF2 = (MPPointF) pool.get();
        mPPointF2.f25204x = mPPointF.f25204x;
        mPPointF2.f25205y = mPPointF.f25205y;
        return mPPointF2;
    }
}
