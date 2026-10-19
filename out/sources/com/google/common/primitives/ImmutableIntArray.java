package com.google.common.primitives;

import A8.p;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ImmutableIntArray implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImmutableIntArray f28011b = new ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;

    public ImmutableIntArray(int[] iArr) {
        int length = iArr.length;
        this.array = iArr;
        this.end = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (this.end != immutableIntArray.end) {
            return false;
        }
        int i10 = 0;
        while (true) {
            int i11 = this.end;
            if (i10 >= i11) {
                return true;
            }
            p.h(i10, i11);
            int i12 = this.array[i10];
            p.h(i10, immutableIntArray.end);
            if (i12 != immutableIntArray.array[i10]) {
                return false;
            }
            i10++;
        }
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.end; i11++) {
            i10 = (i10 * 31) + this.array[i11];
        }
        return i10;
    }

    public Object readResolve() {
        return this.end == 0 ? f28011b : this;
    }

    public final String toString() {
        int i10 = this.end;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        sb2.append(this.array[0]);
        for (int i11 = 1; i11 < this.end; i11++) {
            sb2.append(", ");
            sb2.append(this.array[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public Object writeReplace() {
        int i10 = this.end;
        int[] iArr = this.array;
        return i10 < iArr.length ? new ImmutableIntArray(Arrays.copyOfRange(iArr, 0, i10)) : this;
    }
}
