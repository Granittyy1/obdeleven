package io.intercom.android.sdk.survey.ui;

import Ia.p;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.activity.compose.d;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.core.view.D;
import androidx.core.view.v0;
import androidx.lifecycle.C1377u;
import coil.decode.l;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.survey.CloseEventTrigger;
import io.intercom.android.sdk.survey.SurveyEffects;
import io.intercom.android.sdk.survey.SurveyLaunchMode;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModel;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.g;
import p293xa.r;

/* JADX INFO: compiled from: IntercomSurveyActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomSurveyActivity extends IntercomBaseActivity {
    private static final String PARCEL_SURVEY_ID = "parcel_survey_id";
    private final Injector injector = Injector.get();
    private final g viewModel$delegate = kotlin.a.a(new l(2, this));
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: IntercomSurveyActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public static /* synthetic */ Intent buildIntent$default(Companion companion, Context context, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.buildIntent(context, str);
        }

        public final Intent buildIntent(Context context) {
            i.e(context, "context");
            return buildIntent$default(this, context, null, 2, null);
        }

        private Companion() {
        }

        public final Intent buildIntent(Context context, String str) {
            i.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) IntercomSurveyActivity.class);
            intent.putExtra(IntercomSurveyActivity.PARCEL_SURVEY_ID, str);
            intent.setFlags(335544320);
            return intent;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onStart$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: IntercomSurveyActivity.kt */
    @Aa.c(c = "io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onStart$1", f = "IntercomSurveyActivity.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "invokeSuspend")
    public static final class C24641 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public C24641(kotlin.coroutines.c<? super C24641> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return IntercomSurveyActivity.this.new C24641(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.p<SurveyEffects> effects = IntercomSurveyActivity.this.getViewModel().getEffects();
                final IntercomSurveyActivity intercomSurveyActivity = IntercomSurveyActivity.this;
                InterfaceC2687d<? super SurveyEffects> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity.onStart.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((SurveyEffects) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(SurveyEffects surveyEffects, kotlin.coroutines.c<? super r> cVar) {
                        if (!i.a(surveyEffects, SurveyEffects.ExitSurvey.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        intercomSurveyActivity.finish();
                        return r.f47939a;
                    }
                };
                this.label = 1;
                if (effects.collect(interfaceC2687d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24641) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public static final Intent buildIntent(Context context) {
        return Companion.buildIntent(context);
    }

    private final SurveyViewModel createVM() {
        String stringExtra = getIntent().getStringExtra(PARCEL_SURVEY_ID);
        return SurveyViewModel.Companion.create(this, stringExtra != null ? new SurveyLaunchMode.Programmatic(stringExtra) : new SurveyLaunchMode.Automatic(this.injector.getDataLayer().getSurveyData().getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SurveyViewModel getViewModel() {
        return (SurveyViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyViewModel viewModel_delegate$lambda$0(IntercomSurveyActivity this$0) {
        i.e(this$0, "this$0");
        return this$0.createVM();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        androidx.activity.r.b(this);
        super.onCreate(bundle);
        PhoneNumberValidator.loadCountryAreaCodes(this);
        d.a(this, new ComposableLambdaImpl(true, -179321000, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity.onCreate.1

            /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: IntercomSurveyActivity.kt */
            public static final class C04431 implements p<InterfaceC1084f, Integer, r> {
                final /* synthetic */ IntercomSurveyActivity this$0;

                /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: IntercomSurveyActivity.kt */
                public /* synthetic */ class C04441 extends FunctionReferenceImpl implements Ia.l<A, r> {
                    public C04441(Object obj) {
                        super(1, obj, SurveyViewModel.class, "continueClicked", "continueClicked(Lkotlinx/coroutines/CoroutineScope;)V", 0);
                    }

                    @Override // Ia.l
                    public /* bridge */ /* synthetic */ r invoke(A a10) {
                        invoke2(a10);
                        return r.f47939a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(A a10) {
                        ((SurveyViewModel) this.receiver).continueClicked(a10);
                    }
                }

                public C04431(IntercomSurveyActivity intercomSurveyActivity) {
                    this.this$0 = intercomSurveyActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final r invoke$lambda$0(IntercomSurveyActivity this$0) {
                    i.e(this$0, "this$0");
                    this$0.getViewModel().onCloseClicked(CloseEventTrigger.CLOSE_BUTTON);
                    return r.f47939a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final r invoke$lambda$1(IntercomSurveyActivity this$0, String it) {
                    i.e(this$0, "this$0");
                    i.e(it, "it");
                    this$0.getViewModel().onAnswerUpdated();
                    return r.f47939a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final r invoke$lambda$2(IntercomSurveyActivity this$0, SurveyState.Content.SecondaryCta it) {
                    i.e(this$0, "this$0");
                    i.e(it, "it");
                    this$0.getViewModel().onSecondaryCtaClicked(it);
                    LinkOpener.handleUrl(it.getDestination(), this$0, this$0.injector.getApi());
                    return r.f47939a;
                }

                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                    invoke(interfaceC1084f, num.intValue());
                    return r.f47939a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                    v0.e cVar;
                    if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                        interfaceC1084f.w();
                        return;
                    }
                    X xA = J0.a(this.this$0.getViewModel().getState(), interfaceC1084f, 8);
                    SurveyUiColors surveyUiColors = ((SurveyState) xA.getValue()).getSurveyUiColors();
                    Window window = this.this$0.getWindow();
                    D d10 = new D(this.this$0.getWindow().getDecorView());
                    if (Build.VERSION.SDK_INT >= 30) {
                        v0.d dVar = new v0.d(window.getInsetsController(), d10);
                        dVar.f16996b = window;
                        cVar = dVar;
                    } else {
                        cVar = new v0.c(window, d10);
                    }
                    cVar.c(ColorExtensionsKt.m665isLightColor8_81llA(ColorExtensionsKt.m657darken8_81llA(surveyUiColors.m356getBackground0d7_KjU())));
                    SurveyState surveyState = (SurveyState) xA.getValue();
                    C04441 c04441 = new C04441(this.this$0.getViewModel());
                    final IntercomSurveyActivity intercomSurveyActivity = this.this$0;
                    SurveyComponentKt.SurveyComponent(surveyState, c04441, new Ia.a() { // from class: io.intercom.android.sdk.survey.ui.a
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomSurveyActivity.AnonymousClass1.C04431.invoke$lambda$0(intercomSurveyActivity);
                        }
                    }, new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.b
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return IntercomSurveyActivity.AnonymousClass1.C04431.invoke$lambda$1(intercomSurveyActivity, (String) obj);
                        }
                    }, new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.c
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return IntercomSurveyActivity.AnonymousClass1.C04431.invoke$lambda$2(intercomSurveyActivity, (SurveyState.Content.SecondaryCta) obj);
                        }
                    }, interfaceC1084f, 0, 0);
                }
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
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                i.d(appConfig, "get(...)");
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, androidx.compose.runtime.internal.a.b(-2107771943, new C04431(IntercomSurveyActivity.this), interfaceC1084f), interfaceC1084f, 56);
            }
        }));
    }

    @Override // p100i.d, androidx.fragment.app.ActivityC1347l, android.app.Activity
    public void onStart() {
        super.onStart();
        C2680e.c(C1377u.a(this), null, null, new C24641(null), 3);
        getViewModel().onUiLoaded();
    }

    public static final Intent buildIntent(Context context, String str) {
        return Companion.buildIntent(context, str);
    }
}
