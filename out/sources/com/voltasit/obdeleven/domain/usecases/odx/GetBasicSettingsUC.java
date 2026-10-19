package com.voltasit.obdeleven.domain.usecases.odx;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.voltasit.obdeleven.presentation.basicsettings.CheckNetworkConnection;
import com.voltasit.obdeleven.presentation.basicsettings.DescriptionNotFound;
import com.voltasit.obdeleven.presentation.basicsettings.SomethingWentWrong;
import java.util.List;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: GetBasicSettingsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetBasicSettingsUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A8.b f30887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f30888b;

    public GetBasicSettingsUC(A8.b bVar, j jVar) {
        this.f30887a = bVar;
        this.f30888b = jVar;
    }

    public static final C8.a.C0024a a(GetBasicSettingsUC getBasicSettingsUC, Exception exc) {
        getBasicSettingsUC.getClass();
        if (!(exc instanceof OdxFactory$Exception)) {
            return new C8.a.C0024a(new SomethingWentWrong());
        }
        int iA = ((OdxFactory$Exception) exc).a();
        if (iA != 0) {
            return iA != 1 ? new C8.a.C0024a(new SomethingWentWrong()) : new C8.a.C0024a(new DescriptionNotFound());
        }
        return new C8.a.C0024a(new CheckNetworkConnection());
    }

    public final Object b(ControlUnit controlUnit, kotlin.coroutines.c<? super C8.a<? extends List<p207q8.a>>> cVar) {
        return C2680e.f(N.f43198a, new GetBasicSettingsUC$invoke$2(controlUnit, this, null), cVar);
    }
}
