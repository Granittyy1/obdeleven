package com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting;

import Ia.l;
import J8.p;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.f;
import com.obdeleven.service.odx.model.OdxParamType;
import com.voltasit.obdeleven.domain.timers.BasicSettingStatusTimer;
import com.voltasit.obdeleven.domain.usecases.SaveBasicSettingHistoryUC;
import com.voltasit.obdeleven.domain.usecases.controlUnit.WriteWorkshopInfoUC;
import com.voltasit.obdeleven.presentation.basicsettings.CheckNetworkConnection;
import com.voltasit.obdeleven.presentation.basicsettings.DescriptionNotFound;
import com.voltasit.obdeleven.presentation.basicsettings.SomethingWentWrong;
import kotlin.coroutines.c;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import m8.o;
import p005a4.q;
import p293xa.r;

/* JADX INFO: compiled from: StartBasicSettingUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StartBasicSettingUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.a f30655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicSettingStatusTimer f30657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p084g8.b f30658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SaveBasicSettingHistoryUC f30659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WriteWorkshopInfoUC f30660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f30661g = new f();

    /* JADX INFO: compiled from: StartBasicSettingUC.kt */
    public static final class OdxException extends Throwable {
        public OdxException() {
            super("Odx error");
        }
    }

    /* JADX INFO: compiled from: StartBasicSettingUC.kt */
    public static final class SecurityAccessException extends Throwable {
        public SecurityAccessException() {
            super("Security access needed");
        }
    }

    /* JADX INFO: compiled from: StartBasicSettingUC.kt */
    public static abstract class a {

        /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: StartBasicSettingUC.kt */
        public static final class C0321a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f30662a;

            public C0321a(int i10) {
                this.f30662a = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0321a) && this.f30662a == ((C0321a) obj).f30662a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f30662a);
            }

            public final String toString() {
                return q.c(new StringBuilder("Nrc(code="), this.f30662a, ")");
            }
        }

        /* JADX INFO: compiled from: StartBasicSettingUC.kt */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f30663a = new b();
        }
    }

    /* JADX INFO: compiled from: StartBasicSettingUC.kt */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30664a;

        static {
            int[] iArr = new int[OdxParamType.values().length];
            try {
                iArr[OdxParamType.Value.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OdxParamType.CodedConst.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OdxParamType.Reserved.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OdxParamType.PhysConst.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OdxParamType.TableKey.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OdxParamType.TableStruct.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f30664a = iArr;
        }
    }

    public StartBasicSettingUC(J8.a aVar, p pVar, BasicSettingStatusTimer basicSettingStatusTimer, p084g8.b bVar, SaveBasicSettingHistoryUC saveBasicSettingHistoryUC, WriteWorkshopInfoUC writeWorkshopInfoUC) {
        this.f30655a = aVar;
        this.f30656b = pVar;
        this.f30657c = basicSettingStatusTimer;
        this.f30658d = bVar;
        this.f30659e = saveBasicSettingHistoryUC;
        this.f30660f = writeWorkshopInfoUC;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0082  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00de  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:34:0x0123  */
    /* JADX WARN: Code duplicated, block: B:37:0x0131  */
    /* JADX WARN: Code duplicated, block: B:39:0x0147  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0123 -> B:35:0x012d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC r17, com.obdeleven.service.odx.model.DIAGLAYER r18, java.util.List r19, com.obdeleven.service.odx.e r20, int r21, com.obdeleven.service.odx.Param r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC.a(com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC, com.obdeleven.service.odx.model.DIAGLAYER, java.util.List, com.obdeleven.service.odx.e, int, com.obdeleven.service.odx.Param, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final C8.a.C0024a b(StartBasicSettingUC startBasicSettingUC, Throwable th) {
        startBasicSettingUC.getClass();
        if (!(th instanceof OdxFactory$Exception)) {
            return new C8.a.C0024a(new SomethingWentWrong());
        }
        int iA = ((OdxFactory$Exception) th).a();
        if (iA != 0) {
            return iA != 1 ? new C8.a.C0024a(new SomethingWentWrong()) : new C8.a.C0024a(new DescriptionNotFound());
        }
        return new C8.a.C0024a(new CheckNetworkConnection());
    }

    public final Object c(ControlUnit controlUnit, p207q8.a aVar, Param param, l<? super o, r> lVar, c<? super C8.a<? extends a>> cVar) {
        return C2680e.f(N.f43198a, new StartBasicSettingUC$invoke$2(this, aVar, controlUnit, param, lVar, null), cVar);
    }
}
