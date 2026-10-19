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

/* JADX INFO: compiled from: UDSSubSystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class P1 implements D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControlUnit f42642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CodingType f42649i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f42650k;

    /* JADX INFO: compiled from: UDSSubSystem.java */
    public class a implements Continuation<Boolean, Task<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f42651a;

        public a(int i10) {
            this.f42651a = i10;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Boolean> then(Task<Boolean> task) throws Exception {
            if (!task.getResult().booleanValue()) {
                return Task.forResult(Boolean.FALSE);
            }
            P1 p10 = P1.this;
            boolean z10 = p10.f42650k;
            int i10 = this.f42651a;
            return p10.f42642b.f29335r.d(String.format(Locale.US, "22%04X", Integer.valueOf(z10 ? i10 | 27648 : (i10 | 1792) + 48))).continueWith(new O1(this)).continueWithTask(new N1(this)).continueWithTask(new L1(this)).continueWithTask(new J1(this)).continueWithTask(new H1(this)).continueWithTask(new F1(this)).continueWith(new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.b(1));
        }
    }

    /* JADX INFO: compiled from: UDSSubSystem.java */
    public class b implements Continuation<Boolean, Task<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f42653a;

        public b(int i10) {
            this.f42653a = i10;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Boolean> then(Task<Boolean> task) throws Exception {
            if (!task.getResult().booleanValue()) {
                return Task.forResult(Boolean.FALSE);
            }
            ControlUnit controlUnit = P1.this.f42642b;
            return controlUnit.f29335r.d(String.format(Locale.US, "22%04X", Integer.valueOf(this.f42653a))).continueWith(new Q1(this));
        }
    }

    /* JADX INFO: compiled from: UDSSubSystem.java */
    public class c implements Continuation<Boolean, Task<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f42655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f42656b;

        public c(int i10, String str) {
            this.f42655a = i10;
            this.f42656b = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Integer> then(Task<Boolean> task) throws Exception {
            if (!task.getResult().booleanValue()) {
                return Task.forResult(-1);
            }
            return P1.this.f42642b.f29335r.d(RequestType.WorkshopNumber.a() + I.b.j()).continueWithTask(new S1(this)).continueWith(new R1(this));
        }
    }

    public P1(int i10, ControlUnit controlUnit, boolean z10) {
        this.f42641a = i10;
        this.f42642b = controlUnit;
        this.f42650k = z10;
    }

    @Override // p134k8.D1
    public final Task<Boolean> a() {
        return this.f42642b.a();
    }

    @Override // p134k8.D1
    public final String b() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42642b, sb2, "_", "_");
        d.d(sb2, this.f42641a, "getSerialNumber()");
        String str = this.f42648h;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final Task<Boolean> c() {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42642b, sb2, "_", "_");
        int i10 = this.f42641a;
        d.d(sb2, i10, "identifyInfo()");
        if (!this.f42650k) {
            i10 = ((i10 % 48) & 255) | ((((i10 / 48) * 3) << 8) & 61440);
        }
        return s().continueWithTask(new a(i10));
    }

    @Override // p134k8.D1
    public final String d() {
        String str = this.f42643c;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final Task<Boolean> e() {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42642b, sb2, "_", "_");
        int i10 = this.f42641a;
        d.d(sb2, i10, "readLongCoding()");
        boolean z10 = this.f42650k;
        if (!z10) {
            i10 = ((i10 % 48) & 255) | ((((i10 / 48) * 3) << 8) & 61440);
        }
        return s().continueWithTask(new b(z10 ? i10 | 24576 : (i10 | 1536) + 16));
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
        return this.f42641a;
    }

    @Override // p134k8.D1
    public final ControlUnit h() {
        return this.f42642b;
    }

    @Override // p134k8.D1
    public final String i() {
        String str = this.f42645e;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final String j() {
        String str = this.f42644d;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final CodingType k() {
        CodingType codingType = this.f42649i;
        if (codingType == null || codingType == CodingType.f34402b) {
            return null;
        }
        return codingType;
    }

    @Override // p134k8.D1
    public final String l() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42642b, sb2, "_", "_");
        d.d(sb2, this.f42641a, "getSWNumber()");
        String str = this.f42644d;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final String m() {
        String str = this.f42647g;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final String n() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42642b, sb2, "_", "_");
        d.d(sb2, this.f42641a, "getHWVersion()");
        String str = this.f42647g;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final String o() {
        String str = this.f42646f;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final String p() {
        String str = this.f42648h;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final f q() throws ControlUnitException {
        throw new ControlUnitException(2);
    }

    @Override // p134k8.D1
    public final C2642q1 r() {
        if (this.f42649i == CodingType.f34406f) {
            return new C2642q1(this.j);
        }
        C2642q1 c2642q1 = new C2642q1();
        c2642q1.f42831c = "".toUpperCase();
        return c2642q1;
    }

    @Override // p134k8.D1
    public final Task<Boolean> s() {
        return this.f42642b.D(false);
    }

    @Override // p134k8.D1
    public final String t() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42642b, sb2, "_", "_");
        d.d(sb2, this.f42641a, "getHWNumber()");
        String str = this.f42646f;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final String u() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42642b, sb2, "_", "_");
        d.d(sb2, this.f42641a, "getSystemDescription()");
        String str = this.f42643c;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final CodingType v() throws ControlUnitException {
        CodingType codingType = this.f42649i;
        if (codingType == null || codingType == CodingType.f34402b) {
            throw new ControlUnitException(2);
        }
        return codingType;
    }

    @Override // p134k8.D1
    public final Task<Integer> w(String str) {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42642b, sb2, "_", "_");
        int i10 = this.f42641a;
        d.d(sb2, i10, "writeLongCoding()");
        if (this.f42649i != CodingType.f34406f) {
            return Task.forResult(-1);
        }
        boolean z10 = this.f42650k;
        if (!z10) {
            i10 = ((i10 % 48) & 255) | ((((i10 / 48) * 3) << 8) & 61440);
        }
        return s().continueWithTask(new c(z10 ? i10 | 24576 : (i10 | 1536) + 16, str));
    }

    @Override // p134k8.D1
    public final C2642q1 x() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42642b, sb2, "_", "_");
        sb2.append(this.f42641a);
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
        com.obdeleven.service.core.b.c(this.f42642b, sb2, "_", "_");
        d.d(sb2, this.f42641a, "getSWVersion()");
        String str = this.f42645e;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }
}
