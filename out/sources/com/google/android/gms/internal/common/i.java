package com.google.android.gms.internal.common;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static Object a(Class cls, String str, h... hVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int length = hVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            h hVar = hVarArr[i10];
            hVar.getClass();
            clsArr[i10] = (Class) hVar.f25357b;
            objArr[i10] = hVarArr[i10].f25358c;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
