package T4;

import U4.C0803k;
import com.google.android.gms.common.api.a.c;
import java.util.Arrays;

/* JADX INFO: renamed from: T4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0768a<O extends com.google.android.gms.common.api.a.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.a f5913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.a.c f5914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5915d;

    public C0768a(com.google.android.gms.common.api.a aVar, com.google.android.gms.common.api.a.c cVar, String str) {
        this.f5913b = aVar;
        this.f5914c = cVar;
        this.f5915d = str;
        this.f5912a = Arrays.hashCode(new Object[]{aVar, cVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0768a)) {
            return false;
        }
        C0768a c0768a = (C0768a) obj;
        return C0803k.a(this.f5913b, c0768a.f5913b) && C0803k.a(this.f5914c, c0768a.f5914c) && C0803k.a(this.f5915d, c0768a.f5915d);
    }

    public final int hashCode() {
        return this.f5912a;
    }
}
