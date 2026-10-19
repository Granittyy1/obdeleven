package com.voltasit.obdeleven.domain.usecases.user;

import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SaveUserVehicleFromModificationUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SaveUserVehicleFromModificationUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.v f30976b;

    /* JADX INFO: compiled from: SaveUserVehicleFromModificationUC.kt */
    public static final class SaveUnsuccessful extends Exception {
        public SaveUnsuccessful() {
            super("Failed to save");
        }
    }

    public SaveUserVehicleFromModificationUC(J8.p pVar, K8.v vVar) {
        this.f30975a = pVar;
        this.f30976b = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(p255u9.F f10, ContinuationImpl continuationImpl) {
        SaveUserVehicleFromModificationUC$invoke$1 saveUserVehicleFromModificationUC$invoke$1;
        p255u9.E eB;
        SaveUserVehicleFromModificationUC saveUserVehicleFromModificationUC;
        if (continuationImpl instanceof SaveUserVehicleFromModificationUC$invoke$1) {
            saveUserVehicleFromModificationUC$invoke$1 = (SaveUserVehicleFromModificationUC$invoke$1) continuationImpl;
            int i10 = saveUserVehicleFromModificationUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                saveUserVehicleFromModificationUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                saveUserVehicleFromModificationUC$invoke$1 = new SaveUserVehicleFromModificationUC$invoke$1(this, continuationImpl);
            }
        } else {
            saveUserVehicleFromModificationUC$invoke$1 = new SaveUserVehicleFromModificationUC$invoke$1(this, continuationImpl);
        }
        Object obj = saveUserVehicleFromModificationUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = saveUserVehicleFromModificationUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            eB = p255u9.E.b(f10);
            try {
                Task<Void> taskSaveInBackground = eB.saveInBackground();
                kotlin.jvm.internal.i.d(taskSaveInBackground, "saveInBackground(...)");
                saveUserVehicleFromModificationUC$invoke$1.L$0 = this;
                saveUserVehicleFromModificationUC$invoke$1.L$1 = eB;
                saveUserVehicleFromModificationUC$invoke$1.label = 1;
                if (ParseTaskExtensionsKt.b(taskSaveInBackground, saveUserVehicleFromModificationUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                saveUserVehicleFromModificationUC = this;
            } catch (Exception e10) {
                e = e10;
                saveUserVehicleFromModificationUC = this;
                saveUserVehicleFromModificationUC.f30975a.d(e, false);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eB = (p255u9.E) saveUserVehicleFromModificationUC$invoke$1.L$1;
            saveUserVehicleFromModificationUC = (SaveUserVehicleFromModificationUC) saveUserVehicleFromModificationUC$invoke$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Exception e11) {
                e = e11;
                saveUserVehicleFromModificationUC.f30975a.d(e, false);
            }
        }
        if (saveUserVehicleFromModificationUC.f30976b.z()) {
            p255u9.z zVarL = saveUserVehicleFromModificationUC.f30976b.L();
            kotlin.jvm.internal.i.b(eB);
            zVarL.b().add(eB);
            zVarL.saveInBackground();
            return new C8.a.b(eB);
        }
        return new C8.a.C0024a(new SaveUnsuccessful());
    }
}
