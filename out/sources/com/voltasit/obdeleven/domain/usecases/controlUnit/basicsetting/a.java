package com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting;

import J8.p;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.f;
import com.obdeleven.service.odx.model.OdxParamType;
import com.voltasit.obdeleven.domain.timers.BasicSettingStatusTimer;
import com.voltasit.obdeleven.domain.usecases.SaveBasicSettingHistoryUC;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p293xa.r;

/* JADX INFO: compiled from: StopBasicSettingUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.a f30665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicSettingStatusTimer f30667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SaveBasicSettingHistoryUC f30668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f30669e;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StopBasicSettingUC.kt */
    public /* synthetic */ class C0322a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30670a;

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
            f30670a = iArr;
        }
    }

    public a(J8.a aVar, p pVar, BasicSettingStatusTimer basicSettingStatusTimer, SaveBasicSettingHistoryUC saveBasicSettingHistoryUC, f fVar) {
        this.f30665a = aVar;
        this.f30666b = pVar;
        this.f30667c = basicSettingStatusTimer;
        this.f30668d = saveBasicSettingHistoryUC;
        this.f30669e = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:34:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x012a  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0108 -> B:35:0x0110). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a r16, com.obdeleven.service.odx.model.DIAGLAYER r17, java.util.List r18, com.obdeleven.service.odx.e r19, int r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a.a(com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a, com.obdeleven.service.odx.model.DIAGLAYER, java.util.List, com.obdeleven.service.odx.e, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(ControlUnit controlUnit, p207q8.a aVar, boolean z10, ContinuationImpl continuationImpl) throws Throwable {
        Object objF = C2680e.f(N.f43198a, new StopBasicSettingUC$invoke$2(this, false, z10, aVar, controlUnit, null), continuationImpl);
        return objF == CoroutineSingletons.f43038b ? objF : r.f47939a;
    }
}
