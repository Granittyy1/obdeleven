package I8;

import C4.v;
import androidx.compose.animation.D;
import com.voltasit.obdeleven.domain.models.oca.OcaCategory;
import com.voltasit.obdeleven.domain.models.oca.OcaTestState;
import java.util.List;
import kotlin.jvm.internal.i;
import p005a4.p;
import p005a4.q;

/* JADX INFO: compiled from: Oca.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<String> f3909i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final OcaTestState f3910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OcaCategory f3911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f3912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3914o;

    public a(String id, int i10, String title, String description, int i11, String picture, String video, int i12, List<String> availableValues, boolean z10, OcaTestState ocaTestState, OcaCategory ocaCategory, long j, String developerId, boolean z11) {
        i.e(id, "id");
        i.e(title, "title");
        i.e(description, "description");
        i.e(picture, "picture");
        i.e(video, "video");
        i.e(availableValues, "availableValues");
        i.e(developerId, "developerId");
        this.f3901a = id;
        this.f3902b = i10;
        this.f3903c = title;
        this.f3904d = description;
        this.f3905e = i11;
        this.f3906f = picture;
        this.f3907g = video;
        this.f3908h = i12;
        this.f3909i = availableValues;
        this.j = z10;
        this.f3910k = ocaTestState;
        this.f3911l = ocaCategory;
        this.f3912m = j;
        this.f3913n = developerId;
        this.f3914o = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f3901a, aVar.f3901a) && this.f3902b == aVar.f3902b && i.a(this.f3903c, aVar.f3903c) && i.a(this.f3904d, aVar.f3904d) && this.f3905e == aVar.f3905e && i.a(this.f3906f, aVar.f3906f) && i.a(this.f3907g, aVar.f3907g) && this.f3908h == aVar.f3908h && i.a(this.f3909i, aVar.f3909i) && this.j == aVar.j && this.f3910k == aVar.f3910k && this.f3911l == aVar.f3911l && this.f3912m == aVar.f3912m && i.a(this.f3913n, aVar.f3913n) && this.f3914o == aVar.f3914o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3914o) + B1.a.b(this.f3913n, C4.b.c(this.f3912m, (this.f3911l.hashCode() + ((this.f3910k.hashCode() + D.b(p.d(q.b(this.f3908h, B1.a.b(this.f3907g, B1.a.b(this.f3906f, q.b(this.f3905e, B1.a.b(this.f3904d, B1.a.b(this.f3903c, q.b(this.f3902b, this.f3901a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f3909i), 31, this.j)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Oca(id=");
        sb2.append(this.f3901a);
        sb2.append(", appGroupId=");
        sb2.append(this.f3902b);
        sb2.append(", title=");
        sb2.append(this.f3903c);
        sb2.append(", description=");
        sb2.append(this.f3904d);
        sb2.append(", price=");
        sb2.append(this.f3905e);
        sb2.append(", picture=");
        sb2.append(this.f3906f);
        sb2.append(", video=");
        sb2.append(this.f3907g);
        sb2.append(", usage=");
        sb2.append(this.f3908h);
        sb2.append(", availableValues=");
        sb2.append(this.f3909i);
        sb2.append(", isPublic=");
        sb2.append(this.j);
        sb2.append(", testState=");
        sb2.append(this.f3910k);
        sb2.append(", category=");
        sb2.append(this.f3911l);
        sb2.append(", createdAt=");
        sb2.append(this.f3912m);
        sb2.append(", developerId=");
        sb2.append(this.f3913n);
        sb2.append(", isSkipOriginalValue=");
        return v.f(sb2, this.f3914o, ")");
    }
}
