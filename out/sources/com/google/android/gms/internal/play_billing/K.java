package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class K {
    public static /* synthetic */ boolean a(Unsafe unsafe, I i10, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(i10, j, obj, obj2)) {
            if (unsafe.getObject(i10, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
