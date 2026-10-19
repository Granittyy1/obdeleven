package com.voltasit.obdeleven.domain.usecases.controlUnit;

import Ia.p;
import com.obdeleven.service.enums.RequestType;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.datetime.format.AmPmMarker;
import kotlinx.datetime.format.InterfaceC2717b;
import kotlinx.datetime.format.q;
import kotlinx.datetime.format.u;
import me.zhanghai.android.materialprogressbar.R;
import p109i8.k;
import p293xa.r;

/* JADX INFO: compiled from: WriteWorkshopInfoUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.WriteWorkshopInfoUC$invoke$2", f = "WriteWorkshopInfoUC.kt", l = {R.styleable.AppCompatTheme_alertDialogButtonGroupStyle, R.styleable.AppCompatTheme_buttonBarButtonStyle}, m = "invokeSuspend")
public final class WriteWorkshopInfoUC$invoke$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ ControlUnit $controlUnit;
    Object L$0;
    int label;
    final /* synthetic */ WriteWorkshopInfoUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteWorkshopInfoUC$invoke$2(WriteWorkshopInfoUC writeWorkshopInfoUC, ControlUnit controlUnit, kotlin.coroutines.c<? super WriteWorkshopInfoUC$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = writeWorkshopInfoUC;
        this.$controlUnit = controlUnit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new WriteWorkshopInfoUC$invoke$2(this.this$0, this.$controlUnit, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((WriteWorkshopInfoUC$invoke$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x01b1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k kVar;
        Object objC;
        Object objC2;
        WriteWorkshopInfoUC writeWorkshopInfoUC;
        Throwable thA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kVar = (k) this.L$0;
                kotlin.b.b(obj);
                objC = ((Result) obj).b();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                objC2 = ((Result) obj).b();
            }
            writeWorkshopInfoUC = this.this$0;
            thA = Result.a(objC2);
            if (thA != null) {
                writeWorkshopInfoUC.f30649a.d(thA, false);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        this.this$0.f30649a.f("WriteWorkshopInfoUC", "WriteWorkshopInfoUC()");
        kVar = this.$controlUnit.f29335r;
        if (kVar == null) {
            return r.f47939a;
        }
        Ua.d dVarC = this.this$0.f30650b.c();
        Ua.h.Companion.getClass();
        Ua.f fVarK = F8.a.k(dVarC, Ua.h.f6583b);
        Ua.f.Companion.getClass();
        WriteWorkshopInfoUC$invoke$2$date$1 builder = WriteWorkshopInfoUC$invoke$2$date$1.f30651h;
        i.e(builder, "builder");
        u.a aVar = new u.a(new kotlinx.datetime.internal.format.d());
        builder.invoke(aVar);
        kotlinx.datetime.internal.format.f fVarC = InterfaceC2717b.a.c(aVar);
        StringBuilder sb2 = new StringBuilder();
        Wa.e eVarA = fVarC.a();
        q qVar = new q(0);
        LocalDateTime localDateTime = fVarK.f6580b;
        LocalDate localDate = localDateTime.toLocalDate();
        i.d(localDate, "toLocalDate(...)");
        Ua.e eVar = new Ua.e(localDate);
        kotlinx.datetime.format.p pVar = qVar.f43832a;
        pVar.getClass();
        LocalDate localDate2 = eVar.f6578b;
        pVar.f43828a = Integer.valueOf(localDate2.getYear());
        pVar.f43829b = Integer.valueOf(localDate2.getMonthValue());
        pVar.f43830c = Integer.valueOf(localDate2.getDayOfMonth());
        DayOfWeek dayOfWeek = localDate2.getDayOfWeek();
        i.d(dayOfWeek, "getDayOfWeek(...)");
        pVar.f43831d = Integer.valueOf(dayOfWeek.ordinal() + 1);
        LocalTime localTime = localDateTime.toLocalTime();
        i.d(localTime, "toLocalTime(...)");
        Ua.g gVar = new Ua.g(localTime);
        kotlinx.datetime.format.r rVar = qVar.f43833b;
        rVar.getClass();
        LocalTime localTime2 = gVar.f6582b;
        rVar.f43834a = Integer.valueOf(localTime2.getHour());
        rVar.f43835b = Integer.valueOf(((localTime2.getHour() + 11) % 12) + 1);
        rVar.f43836c = localTime2.getHour() >= 12 ? AmPmMarker.f43631c : AmPmMarker.f43630b;
        rVar.f43837d = Integer.valueOf(localTime2.getMinute());
        rVar.f43838e = Integer.valueOf(localTime2.getSecond());
        rVar.f43839f = Integer.valueOf(localTime2.getNano());
        eVarA.a(qVar, sb2, false);
        String string = sb2.toString();
        i.d(string, "toString(...)");
        this.this$0.f30649a.e("WriteWorkshopInfoUC", "write date");
        Task<String> taskD = kVar.d(RequestType.Date.a() + string);
        i.d(taskD, "request(...)");
        this.L$0 = kVar;
        this.label = 1;
        objC = ParseTaskExtensionsKt.c(taskD, this);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        WriteWorkshopInfoUC writeWorkshopInfoUC2 = this.this$0;
        Throwable thA2 = Result.a(objC);
        if (thA2 != null) {
            writeWorkshopInfoUC2.f30649a.d(thA2, false);
        }
        this.this$0.f30649a.e("WriteWorkshopInfoUC", "write workshop number");
        Task<String> taskD2 = kVar.d(RequestType.WorkshopNumber.a() + I.b.j());
        i.d(taskD2, "request(...)");
        this.L$0 = null;
        this.label = 2;
        objC2 = ParseTaskExtensionsKt.c(taskD2, this);
        if (objC2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        writeWorkshopInfoUC = this.this$0;
        thA = Result.a(objC2);
        if (thA != null) {
            writeWorkshopInfoUC.f30649a.d(thA, false);
        }
        return r.f47939a;
    }
}
