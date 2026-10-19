package io.intercom.android.sdk.survey.ui.questiontype;

import Ia.l;
import Ia.p;
import Ia.q;
import S4.o;
import androidx.compose.animation.k;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.C1068u;
import androidx.compose.material3.DatePickerDialog_androidKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.InterfaceC1067t;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.material3.c0;
import androidx.compose.material3.l0;
import androidx.compose.material3.m0;
import androidx.compose.material3.q0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.n;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.navigation.compose.C1424q;
import coil.decode.y;
import com.voltasit.obdeleven.ui.dialogs.A;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.conversation.ui.components.Q;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: DatePickerQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DatePickerQuestionKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeDatePickerDialog$1, reason: invalid class name */
    /* JADX INFO: compiled from: DatePickerQuestion.kt */
    public static final class AnonymousClass1 implements p<InterfaceC1084f, Integer, r> {
        final /* synthetic */ Answer $answer;
        final /* synthetic */ InterfaceC1067t $datePickerState;
        final /* synthetic */ l<Answer, r> $onAnswer;
        final /* synthetic */ Ia.a<r> $onDismiss;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(InterfaceC1067t interfaceC1067t, Answer answer, l<? super Answer, r> lVar, Ia.a<r> aVar) {
            this.$datePickerState = interfaceC1067t;
            this.$answer = answer;
            this.$onAnswer = lVar;
            this.$onDismiss = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invoke$lambda$1$lambda$0(InterfaceC1067t datePickerState, Answer answer, l onAnswer, Ia.a onDismiss) {
            Answer.DateTimeAnswer dateTimeAnswer;
            kotlin.jvm.internal.i.e(datePickerState, "$datePickerState");
            kotlin.jvm.internal.i.e(answer, "$answer");
            kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
            kotlin.jvm.internal.i.e(onDismiss, "$onDismiss");
            Long lF = datePickerState.f();
            if (lF != null) {
                if (answer instanceof Answer.DateTimeAnswer) {
                    dateTimeAnswer = Answer.DateTimeAnswer.copy$default((Answer.DateTimeAnswer) answer, lF.longValue(), 0, 0, 6, null);
                } else {
                    long jCurrentTimeMillis = Injector.get().getTimeProvider().currentTimeMillis();
                    List utcTime = DatePickerQuestionKt.getUtcTime(TimeFormatter.getHour(jCurrentTimeMillis), TimeFormatter.getMinute(jCurrentTimeMillis));
                    dateTimeAnswer = new Answer.DateTimeAnswer(lF.longValue(), Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1)));
                }
                onAnswer.invoke(dateTimeAnswer);
            } else {
                onDismiss.invoke();
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            interfaceC1084f.L(313001213);
            boolean zK = interfaceC1084f.K(this.$datePickerState) | interfaceC1084f.K(this.$answer) | interfaceC1084f.K(this.$onAnswer) | interfaceC1084f.K(this.$onDismiss);
            final InterfaceC1067t interfaceC1067t = this.$datePickerState;
            final Answer answer = this.$answer;
            final l<Answer, r> lVar = this.$onAnswer;
            final Ia.a<r> aVar = this.$onDismiss;
            Object objF = interfaceC1084f.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.survey.ui.questiontype.i
                    @Override // Ia.a
                    public final Object invoke() {
                        return DatePickerQuestionKt.AnonymousClass1.invoke$lambda$1$lambda$0(interfaceC1067t, answer, lVar, aVar);
                    }
                };
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            ButtonKt.c((Ia.a) objF, null, false, null, null, null, null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m409getLambda2$intercom_sdk_base_release(), interfaceC1084f, 805306368, 510);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    private static final void ComposeDatePickerDialog(final Answer answer, final l<? super Answer, r> lVar, final Ia.a<r> aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        long jCurrentTimeMillis;
        C1086g c1086gP = interfaceC1084f.p(-307045537);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(answer) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(aVar) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (dateTimeAnswer.getDate() > 0) {
                    jCurrentTimeMillis = dateTimeAnswer.getDate();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            final C1068u c1068uO = DatePickerKt.o(Long.valueOf(jCurrentTimeMillis), c1086gP);
            DatePickerDialog_androidKt.a(aVar, androidx.compose.runtime.internal.a.b(308986865, new AnonymousClass1(c1068uO, answer, lVar, aVar), c1086gP), null, androidx.compose.runtime.internal.a.b(1712856051, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.ComposeDatePickerDialog.2
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                    if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        ButtonKt.c(aVar, null, false, null, null, null, null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m410getLambda3$intercom_sdk_base_release(), interfaceC1084f2, 805306368, 510);
                    }
                }
            }, c1086gP), null, 0.0f, null, null, androidx.compose.runtime.internal.a.b(-725444728, new q<InterfaceC0954n, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.ComposeDatePickerDialog.3
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC0954n DatePickerDialog, InterfaceC1084f interfaceC1084f2, int i12) {
                    kotlin.jvm.internal.i.e(DatePickerDialog, "$this$DatePickerDialog");
                    if ((i12 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        DatePickerKt.b(c1068uO, PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), null, null, null, false, null, interfaceC1084f2, 48, R.styleable.AppCompatTheme_windowMinWidthMajor);
                    }
                }
            }, c1086gP), c1086gP, ((i11 >> 6) & 14) | 100666416, 244);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.d
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return DatePickerQuestionKt.ComposeDatePickerDialog$lambda$13(answer, lVar, aVar, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ComposeDatePickerDialog$lambda$13(Answer answer, l onAnswer, Ia.a onDismiss, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(answer, "$answer");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(onDismiss, "$onDismiss");
        ComposeDatePickerDialog(answer, onAnswer, onDismiss, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    private static final void ComposeTimePickerDialog(final Answer answer, final l<? super Answer, r> lVar, final Ia.a<r> aVar, InterfaceC1084f interfaceC1084f, int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1295396418);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(answer) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(aVar) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            List<String> localTime = getLocalTime(answer);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = localTime.iterator();
            while (it.hasNext()) {
                Integer numA = kotlin.text.l.A((String) it.next());
                if (numA != null) {
                    arrayList.add(numA);
                }
            }
            final m0 m0VarT = TimePickerKt.t(((Number) (arrayList.size() > 0 ? arrayList.get(0) : 0)).intValue(), c1086gP, ((Number) (1 < arrayList.size() ? arrayList.get(1) : 0)).intValue());
            AndroidDialog_androidKt.a(aVar, null, androidx.compose.runtime.internal.a.b(-1529528875, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.ComposeTimePickerDialog.1

                /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeTimePickerDialog$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: DatePickerQuestion.kt */
                public static final class C04461 implements p<InterfaceC1084f, Integer, r> {
                    final /* synthetic */ Answer $answer;
                    final /* synthetic */ l<Answer, r> $onAnswer;
                    final /* synthetic */ Ia.a<r> $onDismiss;
                    final /* synthetic */ l0 $timePickerState;

                    /* JADX WARN: Multi-variable type inference failed */
                    public C04461(l0 l0Var, Ia.a<r> aVar, Answer answer, l<? super Answer, r> lVar) {
                        this.$timePickerState = l0Var;
                        this.$onDismiss = aVar;
                        this.$answer = answer;
                        this.$onAnswer = lVar;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final r invoke$lambda$2$lambda$1$lambda$0(l0 timePickerState, Answer answer, l onAnswer) {
                        kotlin.jvm.internal.i.e(timePickerState, "$timePickerState");
                        kotlin.jvm.internal.i.e(answer, "$answer");
                        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
                        List utcTime = DatePickerQuestionKt.getUtcTime(timePickerState.b(), timePickerState.a());
                        onAnswer.invoke(answer instanceof Answer.DateTimeAnswer ? Answer.DateTimeAnswer.copy$default((Answer.DateTimeAnswer) answer, 0L, Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1)), 1, null) : new Answer.DateTimeAnswer(-1L, Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1))));
                        return r.f47939a;
                    }

                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                        invoke(interfaceC1084f, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                            interfaceC1084f.w();
                            return;
                        }
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        float f10 = 24;
                        androidx.compose.ui.h hVarF = PaddingKt.f(aVar, f10);
                        androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13347n;
                        final l0 l0Var = this.$timePickerState;
                        Ia.a<r> aVar3 = this.$onDismiss;
                        final Answer answer = this.$answer;
                        final l<Answer, r> lVar = this.$onAnswer;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, aVar2, interfaceC1084f, 48);
                        int iF = interfaceC1084f.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarF);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f.r();
                        if (interfaceC1084f.m()) {
                            interfaceC1084f.v(aVar4);
                        } else {
                            interfaceC1084f.A();
                        }
                        p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, interfaceC1084f, c0953mA);
                        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z);
                        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                            k.b(iF, interfaceC1084f, iF, pVar3);
                        }
                        p<ComposeUiNode, androidx.compose.ui.h, r> pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, interfaceC1084f, hVarC);
                        TextKt.b("Select time", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((q0) interfaceC1084f.x(TypographyKt.f12404a)).f12700n, interfaceC1084f, 6, 0, 65534);
                        Lb.a.a(interfaceC1084f, W.e(aVar, f10));
                        TimePickerKt.g(0, 8, 14, null, l0Var, interfaceC1084f, null);
                        Lb.a.a(interfaceC1084f, W.e(aVar, f10));
                        androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
                        T tA = S.a(C0945e.f10285b, androidx.compose.ui.d.a.j, interfaceC1084f, 6);
                        int iF2 = interfaceC1084f.F();
                        InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f, hVarD);
                        if (interfaceC1084f.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f.r();
                        if (interfaceC1084f.m()) {
                            interfaceC1084f.v(aVar4);
                        } else {
                            interfaceC1084f.A();
                        }
                        R0.a(pVar, interfaceC1084f, tA);
                        R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z2);
                        if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                            k.b(iF2, interfaceC1084f, iF2, pVar3);
                        }
                        R0.a(pVar4, interfaceC1084f, hVarC2);
                        ComposableSingletons$DatePickerQuestionKt composableSingletons$DatePickerQuestionKt = ComposableSingletons$DatePickerQuestionKt.INSTANCE;
                        ButtonKt.c(aVar3, null, false, null, null, null, null, null, null, composableSingletons$DatePickerQuestionKt.m411getLambda4$intercom_sdk_base_release(), interfaceC1084f, 805306368, 510);
                        Lb.a.a(interfaceC1084f, W.q(aVar, 8));
                        ButtonKt.c(new Ia.a() { // from class: io.intercom.android.sdk.survey.ui.questiontype.j
                            @Override // Ia.a
                            public final Object invoke() {
                                return DatePickerQuestionKt.C24651.C04461.invoke$lambda$2$lambda$1$lambda$0(l0Var, answer, lVar);
                            }
                        }, null, false, null, null, null, null, null, null, composableSingletons$DatePickerQuestionKt.m412getLambda5$intercom_sdk_base_release(), interfaceC1084f, 805306368, 510);
                        interfaceC1084f.J();
                        interfaceC1084f.J();
                    }
                }

                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                    if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        SurfaceKt.a(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), ((c0) interfaceC1084f2.x(ShapesKt.f12298a)).f12433e, 0L, 0L, 6, 0.0f, null, androidx.compose.runtime.internal.a.b(-1066676752, new C04461(m0VarT, aVar, answer, lVar), interfaceC1084f2), interfaceC1084f2, 12607494, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
                    }
                }
            }, c1086gP), c1086gP, ((i11 >> 6) & 14) | 384, 2);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C1424q(answer, lVar, aVar, i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ComposeTimePickerDialog$lambda$27(Answer answer, l onAnswer, Ia.a onDismiss, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(answer, "$answer");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(onDismiss, "$onDismiss");
        ComposeTimePickerDialog(answer, onAnswer, onDismiss, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    private static final void DatePicker(final androidx.compose.ui.h hVar, final Answer answer, final l<? super Answer, r> lVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        String timeInMillisAsDate;
        final X x10;
        C1086g c1086gP = interfaceC1084f.p(2133326452);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(answer) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(lVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            n nVar = (n) c1086gP.x(CompositionLocalsKt.f14848i);
            c1086gP.L(995397106);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(Boolean.FALSE);
                c1086gP.E(objF);
            }
            X x11 = (X) objF;
            c1086gP.T(false);
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (dateTimeAnswer.getDate() != -1) {
                    timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(dateTimeAnswer.getDate(), "dd - MM - YYYY");
                } else {
                    timeInMillisAsDate = "DD - MM - YYYY";
                }
            } else {
                timeInMillisAsDate = "DD - MM - YYYY";
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            String str = timeInMillisAsDate;
            androidx.compose.ui.h hVarC = ClickableKt.c(C0932d.b(A8.p.r(C0935g.a(hVar, 1, H.b(0.1f, intercomTheme.getColors(c1086gP, i13).m645getPrimaryText0d7_KjU()), intercomTheme.getShapes(c1086gP, i13).f12430b), intercomTheme.getShapes(c1086gP, i13).f12430b), intercomTheme.getColors(c1086gP, i13).m621getBackground0d7_KjU(), h0.f13629a), false, null, new Q(nVar, 1, x11), 7);
            T tA = S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarC);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            kotlin.jvm.internal.i.b(str);
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            float f10 = 16;
            TextKt.b(str, W.t(PaddingKt.f(aVar2, f10), null, 3), H.b(contentAlpha(!str.equals("DD - MM - YYYY"), c1086gP, 0), intercomTheme.getColors(c1086gP, i13).m645getPrimaryText0d7_KjU()), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i13).getType04(), c1086gP, 48, 0, 65528);
            IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_ic_pick_date, c1086gP, 0), o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_choose_the_date), PaddingKt.f(aVar2, f10), intercomTheme.getColors(c1086gP, i13).m615getAction0d7_KjU(), c1086gP, 392, 0);
            c1086gP.T(true);
            if (DatePicker$lambda$4(x11)) {
                c1086gP.L(995446935);
                boolean z10 = (i12 & 896) == 256;
                Object objF2 = c1086gP.f();
                if (z10 || objF2 == c0153a) {
                    x10 = x11;
                    objF2 = new l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.e
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return DatePickerQuestionKt.DatePicker$lambda$9$lambda$8(lVar, x10, (Answer) obj);
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    x10 = x11;
                }
                l lVar2 = (l) objF2;
                c1086gP.T(false);
                c1086gP.L(995450986);
                Object objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new y(1, x10);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                ComposeDatePickerDialog(answer, lVar2, (Ia.a) objF3, c1086gP, ((i12 >> 3) & 14) | 384);
            }
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.f
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return DatePickerQuestionKt.DatePicker$lambda$12(hVar, answer, lVar, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DatePicker$lambda$11$lambda$10(X showDatePicker$delegate) {
        kotlin.jvm.internal.i.e(showDatePicker$delegate, "$showDatePicker$delegate");
        DatePicker$lambda$5(showDatePicker$delegate, false);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DatePicker$lambda$12(androidx.compose.ui.h modifier, Answer answer, l onAnswer, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(modifier, "$modifier");
        kotlin.jvm.internal.i.e(answer, "$answer");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        DatePicker(modifier, answer, onAnswer, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    private static final boolean DatePicker$lambda$4(X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    private static final void DatePicker$lambda$5(X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DatePicker$lambda$6(n focusManager, X showDatePicker$delegate) {
        kotlin.jvm.internal.i.e(focusManager, "$focusManager");
        kotlin.jvm.internal.i.e(showDatePicker$delegate, "$showDatePicker$delegate");
        focusManager.u(false);
        DatePicker$lambda$5(showDatePicker$delegate, true);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DatePicker$lambda$9$lambda$8(l onAnswer, X showDatePicker$delegate, Answer newAnswer) {
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(showDatePicker$delegate, "$showDatePicker$delegate");
        kotlin.jvm.internal.i.e(newAnswer, "newAnswer");
        onAnswer.invoke(newAnswer);
        DatePicker$lambda$5(showDatePicker$delegate, false);
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0135  */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146  */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Code duplicated, block: B:80:0x0190  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void DatePickerQuestion(androidx.compose.ui.h hVar, final SurveyData.Step.Question.DatePickerQuestionModel questionModel, Answer answer, final l<? super Answer, r> onAnswer, p<? super InterfaceC1084f, ? super Integer, r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        Answer answer2;
        int i13;
        int i14;
        p<? super InterfaceC1084f, ? super Integer, r> pVarM408getLambda1$intercom_sdk_base_release;
        int i15;
        androidx.compose.ui.h.a aVar;
        int i16;
        Ia.a<ComposeUiNode> aVar2;
        p<ComposeUiNode, Integer, r> pVar2;
        int i17;
        final androidx.compose.ui.h hVar3;
        final Answer answer3;
        final p<? super InterfaceC1084f, ? super Integer, r> pVar3;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(questionModel, "questionModel");
        kotlin.jvm.internal.i.e(onAnswer, "onAnswer");
        C1086g c1086gP = interfaceC1084f.p(1725209962);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        int i19 = i11 & 4;
        if (i19 == 0) {
            if ((i10 & 896) == 0) {
                answer2 = answer;
                i12 |= c1086gP.K(answer2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.k(onAnswer)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i11 & 16;
            if (i14 != 0) {
                if ((57344 & i10) == 0) {
                    pVarM408getLambda1$intercom_sdk_base_release = pVar;
                    if (c1086gP.k(pVarM408getLambda1$intercom_sdk_base_release)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((46731 & i12) == 9346 || !c1086gP.s()) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i18 != 0) {
                        hVar2 = aVar;
                    }
                    if (i19 != 0) {
                        answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVarM408getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m408getLambda1$intercom_sdk_base_release();
                    }
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i16 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, E, r> pVar4 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar4, c1086gP, c0953mA);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar5 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar5, c1086gP, interfaceC1089h0P);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                        J4.i.d(i16, c1086gP, i16, pVar2);
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar6 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar6, c1086gP, hVarC);
                    pVarM408getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 12) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
                    androidx.compose.ui.h hVar4 = hVar2;
                    T tA = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarD);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar4, c1086gP, tA);
                    R0.a(pVar5, c1086gP, interfaceC1089h0P2);
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    }
                    R0.a(pVar6, c1086gP, hVarC2);
                    androidx.compose.ui.h hVarD2 = W.d(aVar, 0.5f);
                    int i20 = i12 >> 3;
                    int i21 = (i20 & 896) | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6;
                    DatePicker(hVarD2, answer2, onAnswer, c1086gP, i21);
                    Lb.a.a(c1086gP, W.q(aVar, 16));
                    TimePicker(W.d(aVar, 1.0f), answer2, onAnswer, c1086gP, i21);
                    c1086gP.T(true);
                    c1086gP.T(true);
                    hVar3 = hVar4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                }
                answer3 = answer2;
                pVar3 = pVarM408getLambda1$intercom_sdk_base_release;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.c
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return DatePickerQuestionKt.DatePickerQuestion$lambda$2(hVar3, questionModel, answer3, onAnswer, pVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            pVarM408getLambda1$intercom_sdk_base_release = pVar;
            if ((46731 & i12) == 9346) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    hVar2 = aVar;
                }
                if (i19 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i14 != 0) {
                    pVarM408getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m408getLambda1$intercom_sdk_base_release();
                }
                C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar7 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar7, c1086gP, c0953mA2);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar8 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar8, c1086gP, interfaceC1089h0P3);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar2);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar2);
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar9 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar9, c1086gP, hVarC3);
                pVarM408getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 12) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                androidx.compose.ui.h hVarD3 = W.d(aVar, 1.0f);
                androidx.compose.ui.h hVar5 = hVar2;
                T tA2 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarD3);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar7, c1086gP, tA2);
                R0.a(pVar8, c1086gP, interfaceC1089h0P4);
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                }
                R0.a(pVar9, c1086gP, hVarC4);
                androidx.compose.ui.h hVarD4 = W.d(aVar, 0.5f);
                int i22 = i12 >> 3;
                int i23 = (i22 & 896) | (i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6;
                DatePicker(hVarD4, answer2, onAnswer, c1086gP, i23);
                Lb.a.a(c1086gP, W.q(aVar, 16));
                TimePicker(W.d(aVar, 1.0f), answer2, onAnswer, c1086gP, i23);
                c1086gP.T(true);
                c1086gP.T(true);
                hVar3 = hVar5;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    hVar2 = aVar;
                }
                if (i19 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i14 != 0) {
                    pVarM408getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m408getLambda1$intercom_sdk_base_release();
                }
                C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar10 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar10, c1086gP, c0953mA3);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar11 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar11, c1086gP, interfaceC1089h0P5);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar2);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar2);
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar12 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar12, c1086gP, hVarC5);
                pVarM408getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 12) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                androidx.compose.ui.h hVarD5 = W.d(aVar, 1.0f);
                androidx.compose.ui.h hVar6 = hVar2;
                T tA3 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarD5);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar10, c1086gP, tA3);
                R0.a(pVar11, c1086gP, interfaceC1089h0P6);
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                }
                R0.a(pVar12, c1086gP, hVarC6);
                androidx.compose.ui.h hVarD6 = W.d(aVar, 0.5f);
                int i24 = i12 >> 3;
                int i25 = (i24 & 896) | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6;
                DatePicker(hVarD6, answer2, onAnswer, c1086gP, i25);
                Lb.a.a(c1086gP, W.q(aVar, 16));
                TimePicker(W.d(aVar, 1.0f), answer2, onAnswer, c1086gP, i25);
                c1086gP.T(true);
                c1086gP.T(true);
                hVar3 = hVar6;
            }
            answer3 = answer2;
            pVar3 = pVarM408getLambda1$intercom_sdk_base_release;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.c
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return DatePickerQuestionKt.DatePickerQuestion$lambda$2(hVar3, questionModel, answer3, onAnswer, pVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        answer2 = answer;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.k(onAnswer)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        i14 = i11 & 16;
        if (i14 != 0) {
            if ((57344 & i10) == 0) {
                pVarM408getLambda1$intercom_sdk_base_release = pVar;
                if (c1086gP.k(pVarM408getLambda1$intercom_sdk_base_release)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((46731 & i12) == 9346) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    hVar2 = aVar;
                }
                if (i19 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i14 != 0) {
                    pVarM408getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m408getLambda1$intercom_sdk_base_release();
                }
                C0953m c0953mA4 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar13 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar13, c1086gP, c0953mA4);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar14 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar14, c1086gP, interfaceC1089h0P7);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar2);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar2);
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar15 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar15, c1086gP, hVarC7);
                pVarM408getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 12) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                androidx.compose.ui.h hVarD7 = W.d(aVar, 1.0f);
                androidx.compose.ui.h hVar7 = hVar2;
                T tA4 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarD7);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar13, c1086gP, tA4);
                R0.a(pVar14, c1086gP, interfaceC1089h0P8);
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                }
                R0.a(pVar15, c1086gP, hVarC8);
                androidx.compose.ui.h hVarD8 = W.d(aVar, 0.5f);
                int i26 = i12 >> 3;
                int i27 = (i26 & 896) | (i26 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6;
                DatePicker(hVarD8, answer2, onAnswer, c1086gP, i27);
                Lb.a.a(c1086gP, W.q(aVar, 16));
                TimePicker(W.d(aVar, 1.0f), answer2, onAnswer, c1086gP, i27);
                c1086gP.T(true);
                c1086gP.T(true);
                hVar3 = hVar7;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    hVar2 = aVar;
                }
                if (i19 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i14 != 0) {
                    pVarM408getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m408getLambda1$intercom_sdk_base_release();
                }
                C0953m c0953mA5 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar16 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar16, c1086gP, c0953mA5);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar17 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar17, c1086gP, interfaceC1089h0P9);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar2);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar2);
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar18 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar18, c1086gP, hVarC9);
                pVarM408getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 12) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                androidx.compose.ui.h hVarD9 = W.d(aVar, 1.0f);
                androidx.compose.ui.h hVar8 = hVar2;
                T tA5 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarD9);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar16, c1086gP, tA5);
                R0.a(pVar17, c1086gP, interfaceC1089h0P10);
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                }
                R0.a(pVar18, c1086gP, hVarC10);
                androidx.compose.ui.h hVarD10 = W.d(aVar, 0.5f);
                int i28 = i12 >> 3;
                int i29 = (i28 & 896) | (i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6;
                DatePicker(hVarD10, answer2, onAnswer, c1086gP, i29);
                Lb.a.a(c1086gP, W.q(aVar, 16));
                TimePicker(W.d(aVar, 1.0f), answer2, onAnswer, c1086gP, i29);
                c1086gP.T(true);
                c1086gP.T(true);
                hVar3 = hVar8;
            }
            answer3 = answer2;
            pVar3 = pVarM408getLambda1$intercom_sdk_base_release;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.c
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return DatePickerQuestionKt.DatePickerQuestion$lambda$2(hVar3, questionModel, answer3, onAnswer, pVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 24576;
        pVarM408getLambda1$intercom_sdk_base_release = pVar;
        if ((46731 & i12) == 9346) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i18 != 0) {
                hVar2 = aVar;
            }
            if (i19 != 0) {
                answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            }
            if (i14 != 0) {
                pVarM408getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m408getLambda1$intercom_sdk_base_release();
            }
            C0953m c0953mA6 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
            androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, hVar2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, E, r> pVar19 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar19, c1086gP, c0953mA6);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar110 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar110, c1086gP, interfaceC1089h0P11);
            pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i16, c1086gP, i16, pVar2);
            } else {
                J4.i.d(i16, c1086gP, i16, pVar2);
            }
            p<ComposeUiNode, androidx.compose.ui.h, r> pVar111 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar111, c1086gP, hVarC11);
            pVarM408getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 12) & 14));
            Lb.a.a(c1086gP, W.e(aVar, 8));
            androidx.compose.ui.h hVarD11 = W.d(aVar, 1.0f);
            androidx.compose.ui.h hVar9 = hVar2;
            T tA6 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
            i17 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
            androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarD11);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar19, c1086gP, tA6);
            R0.a(pVar110, c1086gP, interfaceC1089h0P12);
            if (c1086gP.f12995O) {
                J4.i.d(i17, c1086gP, i17, pVar2);
            } else {
                J4.i.d(i17, c1086gP, i17, pVar2);
            }
            R0.a(pVar111, c1086gP, hVarC12);
            androidx.compose.ui.h hVarD12 = W.d(aVar, 0.5f);
            int i210 = i12 >> 3;
            int i211 = (i210 & 896) | (i210 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6;
            DatePicker(hVarD12, answer2, onAnswer, c1086gP, i211);
            Lb.a.a(c1086gP, W.q(aVar, 16));
            TimePicker(W.d(aVar, 1.0f), answer2, onAnswer, c1086gP, i211);
            c1086gP.T(true);
            c1086gP.T(true);
            hVar3 = hVar9;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i18 != 0) {
                hVar2 = aVar;
            }
            if (i19 != 0) {
                answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            }
            if (i14 != 0) {
                pVarM408getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m408getLambda1$intercom_sdk_base_release();
            }
            C0953m c0953mA7 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
            androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVar2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, E, r> pVar112 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar112, c1086gP, c0953mA7);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar113 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar113, c1086gP, interfaceC1089h0P13);
            pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i16, c1086gP, i16, pVar2);
            } else {
                J4.i.d(i16, c1086gP, i16, pVar2);
            }
            p<ComposeUiNode, androidx.compose.ui.h, r> pVar114 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar114, c1086gP, hVarC13);
            pVarM408getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 12) & 14));
            Lb.a.a(c1086gP, W.e(aVar, 8));
            androidx.compose.ui.h hVarD13 = W.d(aVar, 1.0f);
            androidx.compose.ui.h hVar10 = hVar2;
            T tA7 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
            i17 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
            androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVarD13);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar112, c1086gP, tA7);
            R0.a(pVar113, c1086gP, interfaceC1089h0P14);
            if (c1086gP.f12995O) {
                J4.i.d(i17, c1086gP, i17, pVar2);
            } else {
                J4.i.d(i17, c1086gP, i17, pVar2);
            }
            R0.a(pVar114, c1086gP, hVarC14);
            androidx.compose.ui.h hVarD14 = W.d(aVar, 0.5f);
            int i212 = i12 >> 3;
            int i213 = (i212 & 896) | (i212 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6;
            DatePicker(hVarD14, answer2, onAnswer, c1086gP, i213);
            Lb.a.a(c1086gP, W.q(aVar, 16));
            TimePicker(W.d(aVar, 1.0f), answer2, onAnswer, c1086gP, i213);
            c1086gP.T(true);
            c1086gP.T(true);
            hVar3 = hVar10;
        }
        answer3 = answer2;
        pVar3 = pVarM408getLambda1$intercom_sdk_base_release;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return DatePickerQuestionKt.DatePickerQuestion$lambda$2(hVar3, questionModel, answer3, onAnswer, pVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DatePickerQuestion$lambda$2(androidx.compose.ui.h hVar, SurveyData.Step.Question.DatePickerQuestionModel questionModel, Answer answer, l onAnswer, p pVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(questionModel, "$questionModel");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        DatePickerQuestion(hVar, questionModel, answer, onAnswer, pVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    @IntercomPreviews
    private static final void DatePickerQuestionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1652233850);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m414getLambda7$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.T(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DatePickerQuestionPreview$lambda$28(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        DatePickerQuestionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    private static final void TimePicker(final androidx.compose.ui.h hVar, final Answer answer, final l<? super Answer, r> lVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        String localTime;
        final X x10;
        C1086g c1086gP = interfaceC1084f.p(1270472949);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(answer) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(lVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final n nVar = (n) c1086gP.x(CompositionLocalsKt.f14848i);
            c1086gP.L(-1349242735);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(Boolean.FALSE);
                c1086gP.E(objF);
            }
            final X x11 = (X) objF;
            c1086gP.T(false);
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (kotlin.text.n.S(dateTimeAnswer.getLocalTime())) {
                    localTime = "HH:MM";
                } else {
                    localTime = dateTimeAnswer.getLocalTime();
                }
            } else {
                localTime = "HH:MM";
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            String str = localTime;
            androidx.compose.ui.h hVarC = ClickableKt.c(C0932d.b(A8.p.r(C0935g.a(hVar, 1, H.b(0.1f, intercomTheme.getColors(c1086gP, i13).m645getPrimaryText0d7_KjU()), intercomTheme.getShapes(c1086gP, i13).f12430b), intercomTheme.getShapes(c1086gP, i13).f12430b), intercomTheme.getColors(c1086gP, i13).m621getBackground0d7_KjU(), h0.f13629a), false, null, new Ia.a() { // from class: io.intercom.android.sdk.survey.ui.questiontype.g
                @Override // Ia.a
                public final Object invoke() {
                    return DatePickerQuestionKt.TimePicker$lambda$17(nVar, x11);
                }
            }, 7);
            T tA = S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarC);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            float f10 = 16;
            TextKt.b(str, W.t(PaddingKt.f(aVar2, f10), null, 3), H.b(contentAlpha(!kotlin.jvm.internal.i.a(str, "HH:MM"), c1086gP, 0), intercomTheme.getColors(c1086gP, i13).m645getPrimaryText0d7_KjU()), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i13).getType04(), c1086gP, 48, 0, 65528);
            IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_ic_pick_time, c1086gP, 0), o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_choose_the_date), PaddingKt.f(aVar2, f10), intercomTheme.getColors(c1086gP, i13).m615getAction0d7_KjU(), c1086gP, 392, 0);
            c1086gP.T(true);
            if (TimePicker$lambda$15(x11)) {
                c1086gP.L(-1349194218);
                boolean z10 = (i12 & 896) == 256;
                Object objF2 = c1086gP.f();
                if (z10 || objF2 == c0153a) {
                    x10 = x11;
                    objF2 = new l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.h
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return DatePickerQuestionKt.TimePicker$lambda$20$lambda$19(lVar, x10, (Answer) obj);
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    x10 = x11;
                }
                l lVar2 = (l) objF2;
                c1086gP.T(false);
                c1086gP.L(-1349190167);
                Object objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new A(1, x10);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                ComposeTimePickerDialog(answer, lVar2, (Ia.a) objF3, c1086gP, ((i12 >> 3) & 14) | 384);
            }
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return DatePickerQuestionKt.TimePicker$lambda$23(hVar, answer, lVar, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    private static final boolean TimePicker$lambda$15(X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    private static final void TimePicker$lambda$16(X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TimePicker$lambda$17(n focusManager, X showTimePicker$delegate) {
        kotlin.jvm.internal.i.e(focusManager, "$focusManager");
        kotlin.jvm.internal.i.e(showTimePicker$delegate, "$showTimePicker$delegate");
        focusManager.u(false);
        TimePicker$lambda$16(showTimePicker$delegate, true);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TimePicker$lambda$20$lambda$19(l onAnswer, X showTimePicker$delegate, Answer newAnswer) {
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(showTimePicker$delegate, "$showTimePicker$delegate");
        kotlin.jvm.internal.i.e(newAnswer, "newAnswer");
        onAnswer.invoke(newAnswer);
        TimePicker$lambda$16(showTimePicker$delegate, false);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TimePicker$lambda$22$lambda$21(X showTimePicker$delegate) {
        kotlin.jvm.internal.i.e(showTimePicker$delegate, "$showTimePicker$delegate");
        TimePicker$lambda$16(showTimePicker$delegate, false);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TimePicker$lambda$23(androidx.compose.ui.h modifier, Answer answer, l onAnswer, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(modifier, "$modifier");
        kotlin.jvm.internal.i.e(answer, "$answer");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        TimePicker(modifier, answer, onAnswer, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final float contentAlpha(boolean z10, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(2064501839);
        float f10 = z10 ? 1.0f : 0.6f;
        interfaceC1084f.D();
        return f10;
    }

    private static final List<String> getLocalTime(Answer answer) {
        return answer instanceof Answer.DateTimeAnswer ? kotlin.text.n.e0(((Answer.DateTimeAnswer) answer).getLocalTime(), new String[]{":"}, 0, 6) : EmptyList.f42983b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> getUtcTime(int i10, int i11) {
        String toUtcTime = TimeFormatter.formatToUtcTime(i10, i11);
        kotlin.jvm.internal.i.d(toUtcTime, "formatToUtcTime(...)");
        return kotlin.text.n.e0(toUtcTime, new String[]{":"}, 0, 6);
    }
}
