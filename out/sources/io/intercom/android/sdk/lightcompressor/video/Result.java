package io.intercom.android.sdk.lightcompressor.video;

import C4.b;
import androidx.compose.animation.D;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Result {
    private final String failureMessage;
    private final int index;
    private final String path;
    private final long size;
    private final boolean success;

    public Result(int i10, boolean z10, String str, long j, String str2) {
        this.index = i10;
        this.success = z10;
        this.failureMessage = str;
        this.size = j;
        this.path = str2;
    }

    public static /* synthetic */ Result copy$default(Result result, int i10, boolean z10, String str, long j, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = result.index;
        }
        if ((i11 & 2) != 0) {
            z10 = result.success;
        }
        boolean z11 = z10;
        if ((i11 & 4) != 0) {
            str = result.failureMessage;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            j = result.size;
        }
        long j10 = j;
        if ((i11 & 16) != 0) {
            str2 = result.path;
        }
        return result.copy(i10, z11, str3, j10, str2);
    }

    public final int component1() {
        return this.index;
    }

    public final boolean component2() {
        return this.success;
    }

    public final String component3() {
        return this.failureMessage;
    }

    public final long component4() {
        return this.size;
    }

    public final String component5() {
        return this.path;
    }

    public final Result copy(int i10, boolean z10, String str, long j, String str2) {
        return new Result(i10, z10, str, j, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return this.index == result.index && this.success == result.success && i.a(this.failureMessage, result.failureMessage) && this.size == result.size && i.a(this.path, result.path);
    }

    public final String getFailureMessage() {
        return this.failureMessage;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iB = D.b(Integer.hashCode(this.index) * 31, 31, this.success);
        String str = this.failureMessage;
        int iC = b.c(this.size, (iB + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.path;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Result(index=");
        sb2.append(this.index);
        sb2.append(", success=");
        sb2.append(this.success);
        sb2.append(", failureMessage=");
        sb2.append(this.failureMessage);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", path=");
        return B7.b.g(sb2, this.path, ')');
    }

    public /* synthetic */ Result(int i10, boolean z10, String str, long j, String str2, int i11, e eVar) {
        this(i10, z10, str, (i11 & 8) != 0 ? 0L : j, (i11 & 16) != 0 ? null : str2);
    }
}
