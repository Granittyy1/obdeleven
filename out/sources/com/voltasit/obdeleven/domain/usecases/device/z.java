package com.voltasit.obdeleven.domain.usecases.device;

import com.obdeleven.service.exception.CommandException;
import com.voltasit.obdeleven.domain.models.FirmwareUpdateResponse;
import java.util.Iterator;
import kotlin.Result;
import kotlin.collections.AbstractC2670b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.C2804g;

/* JADX INFO: compiled from: UpdateSecondGenFirmwareUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.h f30828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.a f30829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f30830c;

    public z(K8.h hVar, J8.a aVar, n nVar) {
        this.f30828a = hVar;
        this.f30829b = aVar;
        this.f30830c = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C2804g c2804g, com.voltasit.obdeleven.utils.bluetooth.o oVar, ContinuationImpl continuationImpl) {
        UpdateSecondGenFirmwareUC$invoke$1 updateSecondGenFirmwareUC$invoke$1;
        z zVar;
        String str;
        Object objB;
        String str2;
        if (continuationImpl instanceof UpdateSecondGenFirmwareUC$invoke$1) {
            updateSecondGenFirmwareUC$invoke$1 = (UpdateSecondGenFirmwareUC$invoke$1) continuationImpl;
            int i10 = updateSecondGenFirmwareUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                updateSecondGenFirmwareUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                updateSecondGenFirmwareUC$invoke$1 = new UpdateSecondGenFirmwareUC$invoke$1(this, continuationImpl);
            }
        } else {
            updateSecondGenFirmwareUC$invoke$1 = new UpdateSecondGenFirmwareUC$invoke$1(this, continuationImpl);
        }
        Object obj = updateSecondGenFirmwareUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = updateSecondGenFirmwareUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            String str3 = oVar.f34368c;
            String string = c2804g.getString("version");
            updateSecondGenFirmwareUC$invoke$1.L$0 = this;
            updateSecondGenFirmwareUC$invoke$1.L$1 = str3;
            updateSecondGenFirmwareUC$invoke$1.L$2 = string;
            updateSecondGenFirmwareUC$invoke$1.label = 1;
            Object objC = c(c2804g, oVar, updateSecondGenFirmwareUC$invoke$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            zVar = this;
            str = str3;
            objB = objC;
            str2 = string;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) updateSecondGenFirmwareUC$invoke$1.L$2;
            str = (String) updateSecondGenFirmwareUC$invoke$1.L$1;
            zVar = (z) updateSecondGenFirmwareUC$invoke$1.L$0;
            kotlin.b.b(obj);
            objB = ((Result) obj).b();
        }
        if (!(objB instanceof Result.Failure)) {
            zVar.f30830c.a(FirmwareUpdateResponse.Success, str, str2);
        }
        return objB;
    }

    public final void b(String str, String str2, Throwable th) {
        FirmwareUpdateResponse firmwareUpdateResponse;
        Object next;
        if (th instanceof CommandException) {
            CommandException commandException = (CommandException) th;
            if (commandException.a() == -1) {
                firmwareUpdateResponse = FirmwareUpdateResponse.Timeout;
            } else {
                FirmwareUpdateResponse.a aVar = FirmwareUpdateResponse.f30478b;
                byte bA = (byte) commandException.a();
                aVar.getClass();
                Iterator it = ((AbstractC2670b) FirmwareUpdateResponse.f30486k).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.i.a(((FirmwareUpdateResponse) next).a(), E8.a.f(bA & 255)));
                FirmwareUpdateResponse firmwareUpdateResponse2 = (FirmwareUpdateResponse) next;
                firmwareUpdateResponse = firmwareUpdateResponse2 == null ? FirmwareUpdateResponse.UnknownError : firmwareUpdateResponse2;
            }
        } else {
            firmwareUpdateResponse = FirmwareUpdateResponse.UnknownError;
        }
        this.f30830c.a(firmwareUpdateResponse, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x047d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0484  */
    /* JADX WARN: Code duplicated, block: B:121:0x048f  */
    /* JADX WARN: Code duplicated, block: B:124:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:128:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:132:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:136:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:139:0x0500  */
    /* JADX WARN: Code duplicated, block: B:141:0x0510  */
    /* JADX WARN: Code duplicated, block: B:146:0x05b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:147:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:199:0x04db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:92:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:96:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:98:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:99:0x03fa  */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x05b7 -> B:148:0x05c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(p255u9.C2804g r31, com.voltasit.obdeleven.utils.bluetooth.o r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 1808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.domain.usecases.device.z.c(u9.g, com.voltasit.obdeleven.utils.bluetooth.o, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
