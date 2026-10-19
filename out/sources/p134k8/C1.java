package p134k8;

import androidx.compose.foundation.gestures.snapping.f;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.CodingType;

/* JADX INFO: compiled from: OfflineSubsystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1 implements D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControlUnitDB f42578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControlUnit f42579b;

    public C1(ControlUnit controlUnit, ControlUnitDB controlUnitDB) {
        this.f42578a = controlUnitDB;
        this.f42579b = controlUnit;
    }

    @Override // p134k8.D1
    public final Task<Boolean> a() {
        return Task.forResult(Boolean.TRUE);
    }

    @Override // p134k8.D1
    public final String b() throws ControlUnitException {
        return this.f42578a.getSerialNumber();
    }

    @Override // p134k8.D1
    public final Task<Boolean> c() {
        return Task.forResult(Boolean.TRUE);
    }

    @Override // p134k8.D1
    public final String d() {
        return this.f42578a.getSystemDescription();
    }

    @Override // p134k8.D1
    public final Task<Boolean> e() {
        return Task.forResult(Boolean.TRUE);
    }

    @Override // p134k8.D1
    public final Task<Integer> f(String str) {
        return null;
    }

    @Override // p134k8.D1
    public final Task<Boolean> g() {
        return Task.forResult(Boolean.TRUE);
    }

    @Override // p134k8.D1
    public final int getId() {
        return 0;
    }

    @Override // p134k8.D1
    public final ControlUnit h() {
        return this.f42579b;
    }

    @Override // p134k8.D1
    public final String i() {
        return this.f42578a.getSWVersion();
    }

    @Override // p134k8.D1
    public final String j() {
        return this.f42578a.getSWNumber();
    }

    @Override // p134k8.D1
    public final CodingType k() {
        return this.f42578a.getCodingType();
    }

    @Override // p134k8.D1
    public final String l() throws ControlUnitException {
        return this.f42578a.getSWNumber();
    }

    @Override // p134k8.D1
    public final String m() {
        return this.f42578a.getHWVersion();
    }

    @Override // p134k8.D1
    public final String n() throws ControlUnitException {
        return this.f42578a.getHWVersion();
    }

    @Override // p134k8.D1
    public final String o() {
        return this.f42578a.getHWNumber();
    }

    @Override // p134k8.D1
    public final String p() {
        return this.f42578a.getSerialNumber();
    }

    @Override // p134k8.D1
    public final f q() throws ControlUnitException {
        ControlUnitDB controlUnitDB = this.f42578a;
        if (controlUnitDB.getCodingType() == CodingType.f34405e) {
            return new f(controlUnitDB.getCodingValue(), null);
        }
        throw new ControlUnitException(2);
    }

    @Override // p134k8.D1
    public final C2642q1 r() {
        ControlUnitDB controlUnitDB = this.f42578a;
        if (controlUnitDB.getCodingType() == CodingType.f34406f) {
            return new C2642q1(controlUnitDB.getCodingValue());
        }
        C2642q1 c2642q1 = new C2642q1("");
        c2642q1.f42830b = null;
        return c2642q1;
    }

    @Override // p134k8.D1
    public final Task<Boolean> s() {
        return Task.forResult(Boolean.TRUE);
    }

    @Override // p134k8.D1
    public final String t() throws ControlUnitException {
        return this.f42578a.getHWNumber();
    }

    @Override // p134k8.D1
    public final String u() throws ControlUnitException {
        return this.f42578a.getSystemDescription();
    }

    @Override // p134k8.D1
    public final CodingType v() throws ControlUnitException {
        return this.f42578a.getCodingType();
    }

    @Override // p134k8.D1
    public final Task<Integer> w(String str) {
        return null;
    }

    @Override // p134k8.D1
    public final C2642q1 x() throws ControlUnitException {
        ControlUnitDB controlUnitDB = this.f42578a;
        if (controlUnitDB.getCodingType() == CodingType.f34406f) {
            return new C2642q1(controlUnitDB.getCodingValue());
        }
        throw new ControlUnitException(2);
    }

    @Override // p134k8.D1
    public final f y() {
        ControlUnitDB controlUnitDB = this.f42578a;
        return controlUnitDB.getCodingType() == CodingType.f34405e ? new f(controlUnitDB.getCodingValue(), null) : new f("", null);
    }

    @Override // p134k8.D1
    public final String z() throws ControlUnitException {
        return this.f42578a.getSWVersion();
    }
}
