package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import Ia.l;
import Ia.p;
import Ia.q;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.focus.n;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: DropDownQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DropDownQuestionKt$DropDownQuestion$1$1$1$4 implements q<InterfaceC0954n, InterfaceC1084f, Integer, r> {
    final /* synthetic */ SurveyData.Step.Question.DropDownQuestionModel $dropDownQuestionModel;
    final /* synthetic */ X<Boolean> $expanded$delegate;
    final /* synthetic */ n $focusManager;
    final /* synthetic */ l<Answer, r> $onAnswer;

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1, reason: invalid class name */
    /* JADX INFO: compiled from: DropDownQuestion.kt */
    @Aa.c(c = "io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1", f = "DropDownQuestion.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ n $focusManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(n nVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$focusManager = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$focusManager, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.$focusManager.u(false);
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropDownQuestionKt$DropDownQuestion$1$1$1$4(SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel, n nVar, l<? super Answer, r> lVar, X<Boolean> x10) {
        this.$dropDownQuestionModel = dropDownQuestionModel;
        this.$focusManager = nVar;
        this.$onAnswer = lVar;
        this.$expanded$delegate = x10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$2$lambda$1$lambda$0(l onAnswer, String optionText, X expanded$delegate) {
        i.e(onAnswer, "$onAnswer");
        i.e(optionText, "$optionText");
        i.e(expanded$delegate, "$expanded$delegate");
        onAnswer.invoke(new Answer.SingleAnswer(optionText));
        DropDownQuestionKt.DropDownQuestion$lambda$2(expanded$delegate, false);
        return r.f47939a;
    }

    @Override // Ia.q
    public /* bridge */ /* synthetic */ r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC0954n, interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC0954n DropdownMenu, InterfaceC1084f interfaceC1084f, int i10) {
        i.e(DropdownMenu, "$this$DropdownMenu");
        if ((i10 & 81) == 16 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        E.d(new AnonymousClass1(this.$focusManager, null), interfaceC1084f, "");
        List<String> options = this.$dropDownQuestionModel.getOptions();
        final l<Answer, r> lVar = this.$onAnswer;
        final X<Boolean> x10 = this.$expanded$delegate;
        int i11 = 0;
        for (Object obj : options) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            final String str = (String) obj;
            ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(-864903633, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$2$1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i13) {
                    if ((i13 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                    }
                }
            }, interfaceC1084f);
            interfaceC1084f.L(55713486);
            boolean zK = interfaceC1084f.K(lVar) | interfaceC1084f.K(str);
            Object objF = interfaceC1084f.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.f
                    @Override // Ia.a
                    public final Object invoke() {
                        return DropDownQuestionKt$DropDownQuestion$1$1$1$4.invoke$lambda$2$lambda$1$lambda$0(lVar, str, x10);
                    }
                };
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            AndroidMenu_androidKt.b(composableLambdaImplB, (Ia.a) objF, null, null, null, false, null, null, null, interfaceC1084f, 6, 508);
            i11 = i12;
            x10 = x10;
        }
    }
}
