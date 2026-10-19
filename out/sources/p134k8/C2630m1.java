package p134k8;

import O.e;
import androidx.compose.foundation.gestures.d;
import androidx.compose.foundation.gestures.snapping.f;
import com.obdeleven.service.enums.RequestType;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.CodingType;
import java.util.Locale;

/* JADX INFO: renamed from: k8.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: KWP2000SubSystem22.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2630m1 implements D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControlUnit f42792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CodingType f42799i;
    public String j;

    /* JADX INFO: renamed from: k8.m1$a */
    /* JADX INFO: compiled from: KWP2000SubSystem22.java */
    public class a implements Continuation<Boolean, Task<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f42800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42801b;

        public a(int i10, int i11) {
            this.f42800a = i10;
            this.f42801b = i11;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Boolean> then(Task<Boolean> task) throws Exception {
            if (!task.getResult().booleanValue()) {
                return Task.forResult(Boolean.FALSE);
            }
            ControlUnit controlUnit = C2630m1.this.f42792b;
            return controlUnit.f29335r.d(String.format(Locale.US, "22%1X7%02X", Integer.valueOf(this.f42800a), Integer.valueOf(this.f42801b + 48))).continueWith(new C2627l1(this)).continueWithTask(new C2624k1(this)).continueWithTask(new C2618i1(this)).continueWithTask(new C2612g1(this)).continueWithTask(new C2606e1(this)).continueWithTask(new C2600c1(this)).continueWith(new C2594a1());
        }
    }

    /* JADX INFO: renamed from: k8.m1$b */
    /* JADX INFO: compiled from: KWP2000SubSystem22.java */
    public class b implements Continuation<Boolean, Task<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f42803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42804b;

        public b(int i10, int i11) {
            this.f42803a = i10;
            this.f42804b = i11;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Boolean> then(Task<Boolean> task) throws Exception {
            if (!task.getResult().booleanValue()) {
                return Task.forResult(Boolean.FALSE);
            }
            ControlUnit controlUnit = C2630m1.this.f42792b;
            return controlUnit.f29335r.d(String.format(Locale.US, "22%1X6%02X", Integer.valueOf(this.f42803a), Integer.valueOf(this.f42804b + 16))).continueWith(new C2633n1(this));
        }
    }

    /* JADX INFO: renamed from: k8.m1$c */
    /* JADX INFO: compiled from: KWP2000SubSystem22.java */
    public class c implements Continuation<Boolean, Task<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f42806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f42808c;

        public c(int i10, int i11, String str) {
            this.f42806a = i10;
            this.f42807b = i11;
            this.f42808c = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Integer> then(Task<Boolean> task) throws Exception {
            if (!task.getResult().booleanValue()) {
                return Task.forResult(-1);
            }
            return C2630m1.this.f42792b.f29335r.d(RequestType.WorkshopNumber.a() + I.b.j()).continueWithTask(new C2639p1(this)).continueWith(new C2636o1(this));
        }
    }

    public C2630m1(int i10, ControlUnit controlUnit) {
        this.f42791a = i10;
        this.f42792b = controlUnit;
    }

    @Override // p134k8.D1
    public final Task<Boolean> a() {
        return this.f42792b.a();
    }

    @Override // p134k8.D1
    public final String b() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42792b, sb2, "_", "_");
        d.d(sb2, this.f42791a, "getSerialNumber()");
        String str = this.f42798h;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final Task<Boolean> c() {
        int i10 = this.f42791a;
        int i11 = 0;
        int i12 = i10;
        while (i12 > 47) {
            i12 -= 48;
            i11 += 3;
        }
        StringBuilder sb2 = new StringBuilder();
        ControlUnit controlUnit = this.f42792b;
        sb2.append(controlUnit.t());
        sb2.append("_");
        sb2.append(controlUnit.getName());
        sb2.append("_");
        sb2.append(i10);
        e.j(sb2.toString(), "identifyInfo()");
        return s().continueWithTask(new a(i11, i12));
    }

    @Override // p134k8.D1
    public final String d() {
        String str = this.f42793c;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final Task<Boolean> e() {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42792b, sb2, "_", "_");
        int i10 = this.f42791a;
        d.d(sb2, i10, "readLongCoding()");
        int i11 = 0;
        while (i10 > 47) {
            i10 -= 48;
            i11 += 3;
        }
        return s().continueWithTask(new b(i11, i10));
    }

    @Override // p134k8.D1
    public final Task<Integer> f(String str) {
        return Task.forResult(-1);
    }

    @Override // p134k8.D1
    public final Task<Boolean> g() {
        return Task.forResult(Boolean.FALSE);
    }

    @Override // p134k8.D1
    public final int getId() {
        return this.f42791a;
    }

    @Override // p134k8.D1
    public final ControlUnit h() {
        return this.f42792b;
    }

    @Override // p134k8.D1
    public final String i() {
        String str = this.f42795e;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final String j() {
        String str = this.f42794d;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final CodingType k() {
        CodingType codingType = this.f42799i;
        if (codingType == null || codingType == CodingType.f34402b) {
            return null;
        }
        return codingType;
    }

    @Override // p134k8.D1
    public final String l() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42792b, sb2, "_", "_");
        d.d(sb2, this.f42791a, "getSWNumber()");
        String str = this.f42794d;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final String m() {
        String str = this.f42797g;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final String n() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42792b, sb2, "_", "_");
        d.d(sb2, this.f42791a, "getHWVersion()");
        String str = this.f42797g;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final String o() {
        String str = this.f42796f;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final String p() {
        String str = this.f42798h;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final f q() throws ControlUnitException {
        throw new ControlUnitException(2);
    }

    @Override // p134k8.D1
    public final C2642q1 r() {
        if (k() == CodingType.f34406f) {
            return new C2642q1(this.j);
        }
        C2642q1 c2642q1 = new C2642q1();
        c2642q1.f42831c = "".toUpperCase();
        return c2642q1;
    }

    @Override // p134k8.D1
    public final Task<Boolean> s() {
        return this.f42792b.D(false);
    }

    @Override // p134k8.D1
    public final String t() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42792b, sb2, "_", "_");
        d.d(sb2, this.f42791a, "getHWNumber()");
        String str = this.f42796f;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final String u() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42792b, sb2, "_", "_");
        d.d(sb2, this.f42791a, "getSystemDescription()");
        String str = this.f42793c;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final CodingType v() throws ControlUnitException {
        CodingType codingType = this.f42799i;
        if (codingType == null || codingType == CodingType.f34402b) {
            throw new ControlUnitException(2);
        }
        return codingType;
    }

    @Override // p134k8.D1
    public final Task<Integer> w(String str) {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42792b, sb2, "_", "_");
        int i10 = this.f42791a;
        d.d(sb2, i10, "writeLongCoding()");
        if (this.f42799i != CodingType.f34406f) {
            return Task.forResult(-1);
        }
        int i11 = 0;
        while (i10 > 47) {
            i10 -= 48;
            i11 += 3;
        }
        return s().continueWithTask(new c(i11, i10, str));
    }

    @Override // p134k8.D1
    public final C2642q1 x() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42792b, sb2, "_", "_");
        sb2.append(this.f42791a);
        e.j(sb2.toString(), "getLongCoding()");
        if (v() == CodingType.f34406f) {
            return new C2642q1(this.j);
        }
        throw new ControlUnitException(2);
    }

    @Override // p134k8.D1
    public final f y() {
        return new f("", null);
    }

    @Override // p134k8.D1
    public final String z() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42792b, sb2, "_", "_");
        d.d(sb2, this.f42791a, "getSWVersion()");
        String str = this.f42795e;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }
}
