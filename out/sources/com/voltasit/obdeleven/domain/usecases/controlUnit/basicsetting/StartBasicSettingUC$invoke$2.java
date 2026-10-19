package com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting;

import Aa.c;
import Ia.l;
import Ia.p;
import O.h;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.e;
import com.obdeleven.service.odx.model.DIAGLAYER;
import com.obdeleven.service.odx.model.PARAM;
import com.obdeleven.service.odx.model.SNREF;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import com.voltasit.obdeleven.domain.timers.BasicSettingStatusTimer;
import com.voltasit.obdeleven.domain.usecases.controlUnit.WriteWorkshopInfoUC;
import com.voltasit.obdeleven.presentation.basicsettings.SomethingWentWrong;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlinx.coroutines.A;
import m8.o;
import me.zhanghai.android.materialprogressbar.R;
import p109i8.k;
import p293xa.r;

/* JADX INFO: compiled from: StartBasicSettingUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC$invoke$2", f = "StartBasicSettingUC.kt", l = {R.styleable.AppCompatTheme_colorControlHighlight, R.styleable.AppCompatTheme_homeAsUpIndicator, R.styleable.AppCompatTheme_listPreferredItemHeight, R.styleable.AppCompatTheme_listPreferredItemPaddingRight, R.styleable.AppCompatTheme_panelBackground}, m = "invokeSuspend")
public final class StartBasicSettingUC$invoke$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super C8.a<? extends StartBasicSettingUC.a>>, Object> {
    final /* synthetic */ p207q8.a $basicSetting;
    final /* synthetic */ ControlUnit $controlUnit;
    final /* synthetic */ Param $optionsParam;
    final /* synthetic */ l<o, r> $statusUpdateDelegate;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ StartBasicSettingUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StartBasicSettingUC$invoke$2(StartBasicSettingUC startBasicSettingUC, p207q8.a aVar, ControlUnit controlUnit, Param param, l<? super o, r> lVar, kotlin.coroutines.c<? super StartBasicSettingUC$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = startBasicSettingUC;
        this.$basicSetting = aVar;
        this.$controlUnit = controlUnit;
        this.$optionsParam = param;
        this.$statusUpdateDelegate = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new StartBasicSettingUC$invoke$2(this.this$0, this.$basicSetting, this.$controlUnit, this.$optionsParam, this.$statusUpdateDelegate, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super C8.a<? extends StartBasicSettingUC.a>> cVar) {
        return ((StartBasicSettingUC$invoke$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:10:0x001b, B:59:0x014e, B:61:0x015b, B:62:0x0175, B:64:0x017d, B:66:0x0198, B:67:0x01a3, B:68:0x01af, B:55:0x012e), top: B:76:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0175 A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:10:0x001b, B:59:0x014e, B:61:0x015b, B:62:0x0175, B:64:0x017d, B:66:0x0198, B:67:0x01a3, B:68:0x01af, B:55:0x012e), top: B:76:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x017d A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:10:0x001b, B:59:0x014e, B:61:0x015b, B:62:0x0175, B:64:0x017d, B:66:0x0198, B:67:0x01a3, B:68:0x01af, B:55:0x012e), top: B:76:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0198 A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:10:0x001b, B:59:0x014e, B:61:0x015b, B:62:0x0175, B:64:0x017d, B:66:0x0198, B:67:0x01a3, B:68:0x01af, B:55:0x012e), top: B:76:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a3 A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:10:0x001b, B:59:0x014e, B:61:0x015b, B:62:0x0175, B:64:0x017d, B:66:0x0198, B:67:0x01a3, B:68:0x01af, B:55:0x012e), top: B:76:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01af A[Catch: all -> 0x01ba, TRY_LEAVE, TryCatch #1 {all -> 0x01ba, blocks: (B:10:0x001b, B:59:0x014e, B:61:0x015b, B:62:0x0175, B:64:0x017d, B:66:0x0198, B:67:0x01a3, B:68:0x01af, B:55:0x012e), top: B:76:0x000b }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        Object objB;
        Object objA;
        k kVar;
        Param param;
        Task<Boolean> taskD;
        WriteWorkshopInfoUC writeWorkshopInfoUC;
        ControlUnit controlUnit;
        Object objB2;
        k kVar2;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = this.label;
        try {
            try {
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            i10 = this.I$0;
                            b.b(obj);
                            objB = obj;
                        } else if (i11 == 2) {
                            k kVar3 = (k) this.L$0;
                            b.b(obj);
                            kVar = kVar3;
                            objA = obj;
                            param = (Param) objA;
                            taskD = this.$controlUnit.D(false);
                            i.d(taskD, "connect(...)");
                            this.L$0 = kVar;
                            this.L$1 = param;
                            this.label = 3;
                            if (ParseTaskExtensionsKt.b(taskD, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            writeWorkshopInfoUC = this.this$0.f30660f;
                            controlUnit = this.$controlUnit;
                            this.L$0 = kVar;
                            this.L$1 = param;
                            this.label = 4;
                            if (writeWorkshopInfoUC.a(controlUnit, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            Task<String> taskD2 = kVar.d(E8.a.g(param.g()));
                            i.d(taskD2, "request(...)");
                            this.L$0 = kVar;
                            this.L$1 = null;
                            this.label = 5;
                            objB2 = ParseTaskExtensionsKt.b(taskD2, this);
                            if (objB2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            kVar2 = kVar;
                        } else if (i11 == 3) {
                            param = (Param) this.L$1;
                            kVar = (k) this.L$0;
                            b.b(obj);
                            writeWorkshopInfoUC = this.this$0.f30660f;
                            controlUnit = this.$controlUnit;
                            this.L$0 = kVar;
                            this.L$1 = param;
                            this.label = 4;
                            if (writeWorkshopInfoUC.a(controlUnit, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            Task<String> taskD3 = kVar.d(E8.a.g(param.g()));
                            i.d(taskD3, "request(...)");
                            this.L$0 = kVar;
                            this.L$1 = null;
                            this.label = 5;
                            objB2 = ParseTaskExtensionsKt.b(taskD3, this);
                            if (objB2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            kVar2 = kVar;
                        } else if (i11 == 4) {
                            param = (Param) this.L$1;
                            kVar = (k) this.L$0;
                            b.b(obj);
                            Task<String> taskD4 = kVar.d(E8.a.g(param.g()));
                            i.d(taskD4, "request(...)");
                            this.L$0 = kVar;
                            this.L$1 = null;
                            this.label = 5;
                            objB2 = ParseTaskExtensionsKt.b(taskD4, this);
                            if (objB2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            kVar2 = kVar;
                        } else {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kVar2 = (k) this.L$0;
                            b.b(obj);
                            objB2 = obj;
                        }
                        str = (String) objB2;
                        i.b(str);
                        if (m.I(str, "71", false)) {
                            final StartBasicSettingUC startBasicSettingUC = this.this$0;
                            BasicSettingStatusTimer basicSettingStatusTimer = startBasicSettingUC.f30657c;
                            final ControlUnit controlUnit2 = this.$controlUnit;
                            final p207q8.a aVar = this.$basicSetting;
                            final l<o, r> lVar = this.$statusUpdateDelegate;
                            basicSettingStatusTimer.b(kVar2, controlUnit2, new l<o, r>() { // from class: com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC$invoke$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(o oVar) {
                                    o it = oVar;
                                    i.e(it, "it");
                                    StartBasicSettingUC startBasicSettingUC2 = startBasicSettingUC;
                                    ControlUnit controlUnit3 = controlUnit2;
                                    p207q8.a aVar2 = aVar;
                                    l<o, r> lVar2 = lVar;
                                    startBasicSettingUC2.getClass();
                                    lVar2.invoke(it);
                                    boolean z10 = it instanceof o.h;
                                    if (z10) {
                                        startBasicSettingUC2.f30659e.a(controlUnit3, aVar2);
                                    }
                                    if (!z10) {
                                        startBasicSettingUC2.f30658d.i(it.f44637a);
                                    }
                                    return r.f47939a;
                                }
                            });
                            return new C8.a.b(StartBasicSettingUC.a.b.f30663a);
                        }
                        if (m.I(str, "7F", false)) {
                            return new C8.a.C0024a(new SomethingWentWrong());
                        }
                        this.this$0.getClass();
                        String strSubstring = str.substring(4);
                        i.d(strSubstring, "substring(...)");
                        h.c(16);
                        int i12 = Integer.parseInt(strSubstring, 16);
                        return i12 == 51 ? new C8.a.C0024a(new StartBasicSettingUC.SecurityAccessException()) : new C8.a.b(new StartBasicSettingUC.a.C0321a(i12));
                    }
                    b.b(obj);
                    this.this$0.f30656b.f("StartBasicSettingUC", "StartBasicSettingUC()");
                    this.this$0.f30658d.h();
                    i10 = this.$basicSetting.f46177d;
                    Task<e> taskX = this.$controlUnit.X();
                    i.d(taskX, "getODX(...)");
                    this.I$0 = i10;
                    this.label = 1;
                    objB = ParseTaskExtensionsKt.b(taskX, this);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i13 = i10;
                    i.d(objB, "suspend(...)");
                    e eVar = (e) objB;
                    k kVar4 = this.$controlUnit.f29335r;
                    if (kVar4 == null) {
                        return new C8.a.C0024a(new SomethingWentWrong());
                    }
                    SNREF snref = new SNREF();
                    snref.setSHORTNAME("DiagnServi_RoutiContrStartBasicSetti");
                    e.b bVarF = eVar.f(snref);
                    if (bVarF == null) {
                        return new C8.a.C0024a(new StartBasicSettingUC.OdxException());
                    }
                    e.f fVarY = eVar.y(bVarF.f29497a.getREQUESTREF(), bVarF.f29498b);
                    if (fVarY == null) {
                        return new C8.a.C0024a(new StartBasicSettingUC.OdxException());
                    }
                    StartBasicSettingUC startBasicSettingUC2 = this.this$0;
                    DIAGLAYER diaglayer = fVarY.f29506b;
                    List<PARAM> param2 = fVarY.f29505a.getPARAMS().getPARAM();
                    i.d(param2, "getPARAM(...)");
                    Param param3 = this.$optionsParam;
                    this.L$0 = kVar4;
                    this.label = 2;
                    objA = StartBasicSettingUC.a(startBasicSettingUC2, diaglayer, param2, eVar, i13, param3, this);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kVar = kVar4;
                    param = (Param) objA;
                    taskD = this.$controlUnit.D(false);
                    i.d(taskD, "connect(...)");
                    this.L$0 = kVar;
                    this.L$1 = param;
                    this.label = 3;
                    if (ParseTaskExtensionsKt.b(taskD, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    writeWorkshopInfoUC = this.this$0.f30660f;
                    controlUnit = this.$controlUnit;
                    this.L$0 = kVar;
                    this.L$1 = param;
                    this.label = 4;
                    if (writeWorkshopInfoUC.a(controlUnit, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Task<String> taskD5 = kVar.d(E8.a.g(param.g()));
                    i.d(taskD5, "request(...)");
                    this.L$0 = kVar;
                    this.L$1 = null;
                    this.label = 5;
                    objB2 = ParseTaskExtensionsKt.b(taskD5, this);
                    if (objB2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kVar2 = kVar;
                    str = (String) objB2;
                    i.b(str);
                    if (m.I(str, "71", false)) {
                        final StartBasicSettingUC startBasicSettingUC3 = this.this$0;
                        BasicSettingStatusTimer basicSettingStatusTimer2 = startBasicSettingUC3.f30657c;
                        final ControlUnit controlUnit3 = this.$controlUnit;
                        final p207q8.a aVar2 = this.$basicSetting;
                        final l<? super o, r> lVar2 = this.$statusUpdateDelegate;
                        basicSettingStatusTimer2.b(kVar2, controlUnit3, new l<o, r>() { // from class: com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC$invoke$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(o oVar) {
                                o it = oVar;
                                i.e(it, "it");
                                StartBasicSettingUC startBasicSettingUC4 = startBasicSettingUC3;
                                ControlUnit controlUnit4 = controlUnit3;
                                p207q8.a aVar3 = aVar2;
                                l<o, r> lVar3 = lVar2;
                                startBasicSettingUC4.getClass();
                                lVar3.invoke(it);
                                boolean z10 = it instanceof o.h;
                                if (z10) {
                                    startBasicSettingUC4.f30659e.a(controlUnit4, aVar3);
                                }
                                if (!z10) {
                                    startBasicSettingUC4.f30658d.i(it.f44637a);
                                }
                                return r.f47939a;
                            }
                        });
                        return new C8.a.b(StartBasicSettingUC.a.b.f30663a);
                    }
                    if (m.I(str, "7F", false)) {
                        return new C8.a.C0024a(new SomethingWentWrong());
                    }
                    this.this$0.getClass();
                    String strSubstring2 = str.substring(4);
                    i.d(strSubstring2, "substring(...)");
                    h.c(16);
                    int i14 = Integer.parseInt(strSubstring2, 16);
                    if (i14 == 51) {
                    }
                } catch (Throwable th) {
                    return StartBasicSettingUC.b(this.this$0, th);
                }
            } catch (Throwable unused) {
                return new C8.a.C0024a(new SomethingWentWrong());
            }
        } catch (Throwable th2) {
            return StartBasicSettingUC.b(this.this$0, th2);
        }
    }
}
