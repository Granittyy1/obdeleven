package io.intercom.android.sdk.survey;

import Oa.c;
import Z3.o;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.StatsCtaRequestModel;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequestItem;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.model.SurveySenderAvatar;
import io.intercom.android.sdk.survey.model.SurveySenderData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.text.n;
import kotlinx.coroutines.A;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.q;
import kotlinx.coroutines.flow.w;
import p014b1.f;
import p293xa.r;

/* JADX INFO: compiled from: SurveyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyViewModel extends Y {
    public static final int ENTITY_TYPE = 85;
    private final AppConfig appConfig;
    private final List<SubmitSurveyRequestItem> completedResponses;
    private final List<SurveyData.Step> completedSteps;
    private SurveyData.Step currentStep;
    private final AbstractC2712w dispatcher;
    private final p<SurveyEffects> effects;
    private final IntercomDataLayer intercomDataLayer;
    private final SurveyLaunchMode launchMode;
    private final MetricTracker metricTracker;
    private final q<SurveyState> state;
    private SurveyData surveyData;
    private final SurveyRepository surveyRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.survey.SurveyViewModel$Companion$factory$1] */
        private final SurveyViewModel$Companion$factory$1 factory(final SurveyLaunchMode surveyLaunchMode) {
            return new a0.c() { // from class: io.intercom.android.sdk.survey.SurveyViewModel$Companion$factory$1
                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(c cVar, p014b1.a aVar) {
                    return super.create(cVar, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Class cls, p014b1.a aVar) {
                    return super.create(cls, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public <T extends Y> T create(Class<T> modelClass) {
                    i.e(modelClass, "modelClass");
                    return new SurveyViewModel(null, surveyLaunchMode, null, null, null, null, 61, null);
                }
            };
        }

        public final SurveyViewModel create(c0 owner, SurveyLaunchMode launchMode) {
            i.e(owner, "owner");
            i.e(launchMode, "launchMode");
            SurveyViewModel$Companion$factory$1 factory = factory(launchMode);
            i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            p014b1.a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b;
            i.e(store, "store");
            i.e(defaultCreationExtras, "defaultCreationExtras");
            f fVar = new f(store, factory, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = l.a(SurveyViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (SurveyViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SurveyData.StepType.values().length];
            try {
                iArr[SurveyData.StepType.QUESTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.StepType.INTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.StepType.CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.StepType.THANK_YOU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CloseEventTrigger.values().length];
            try {
                iArr2[CloseEventTrigger.CTA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CloseEventTrigger.CLOSE_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CloseEventTrigger.SECONDARY_CTA_EXTERNAL_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CloseEventTrigger.SECONDARY_CTA_DEEP_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$fetchAndShowSurvey$1, reason: invalid class name */
    /* JADX INFO: compiled from: SurveyViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.survey.SurveyViewModel$fetchAndShowSurvey$1", f = "SurveyViewModel.kt", l = {142}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ String $surveyId;
        final /* synthetic */ SurveyUiColors $uiColors;
        int label;
        final /* synthetic */ SurveyViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, SurveyViewModel surveyViewModel, SurveyUiColors surveyUiColors, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$surveyId = str;
            this.this$0 = surveyViewModel;
            this.$uiColors = surveyUiColors;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invokeSuspend$lambda$0(SurveyViewModel surveyViewModel, String str) {
            surveyViewModel.fetchAndShowSurvey(str);
            return r.f47939a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$surveyId, this.this$0, this.$uiColors, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                if (n.S(this.$surveyId)) {
                    this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
                    return r.f47939a;
                }
                this.this$0.emitLoading();
                SurveyRepository surveyRepository = this.this$0.surveyRepository;
                String str = this.$surveyId;
                this.label = 1;
                obj = surveyRepository.fetchSurvey(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            NetworkResponse networkResponse = (NetworkResponse) obj;
            if (networkResponse instanceof NetworkResponse.Success) {
                this.this$0.surveyData = ((FetchSurveyRequest) ((NetworkResponse.Success) networkResponse).getBody()).getSurvey();
                if (this.this$0.surveyData.getSteps().isEmpty()) {
                    this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
                } else {
                    this.this$0.metricTracker.surveyOpened("opened", "survey", MetricTracker.Context.FROM_PROGRAMMATIC, this.this$0.surveyData.getId(), this.this$0.surveyData.getFormatMetric());
                    SurveyViewModel surveyViewModel = this.this$0;
                    surveyViewModel.currentStep = (SurveyData.Step) kotlin.collections.q.O(surveyViewModel.surveyData.getSteps());
                    q<SurveyState> state = this.this$0.getState();
                    SurveyViewModel surveyViewModel2 = this.this$0;
                    state.setValue(surveyViewModel2.buildContentState(surveyViewModel2.surveyData));
                }
            } else if (networkResponse instanceof NetworkResponse.ClientError) {
                this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
            } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                q<SurveyState> state2 = this.this$0.getState();
                TopBarState.NoTopBarState noTopBarState = new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null);
                SurveyUiColors surveyUiColors = this.$uiColors;
                final SurveyViewModel surveyViewModel3 = this.this$0;
                final String str2 = this.$surveyId;
                state2.setValue(new SurveyState.Error.WithCTA(0, surveyUiColors, noTopBarState, new Ia.a() { // from class: io.intercom.android.sdk.survey.a
                    @Override // Ia.a
                    public final Object invoke() {
                        return SurveyViewModel.AnonymousClass1.invokeSuspend$lambda$0(surveyViewModel3, str2);
                    }
                }, 1, null));
            } else {
                if (!(networkResponse instanceof NetworkResponse.ServerError)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(R.string.intercom_page_not_found, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null)));
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SurveyViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1", f = "SurveyViewModel.kt", l = {291}, m = "invokeSuspend")
    public static final class C24521 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ CloseEventTrigger $triggerType;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: SurveyViewModel.kt */
        @Aa.c(c = "io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1$1", f = "SurveyViewModel.kt", l = {275, 280}, m = "invokeSuspend")
        public static final class C04351 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
            int label;
            final /* synthetic */ SurveyViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04351(SurveyViewModel surveyViewModel, kotlin.coroutines.c<? super C04351> cVar) {
                super(2, cVar);
                this.this$0 = surveyViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C04351(this.this$0, cVar);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x006b  */
            /* JADX WARN: Code duplicated, block: B:23:0x0087 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SurveyViewModel surveyViewModel;
                String id;
                String surveyProgressId;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    if (!this.this$0.surveyData.getSteps().isEmpty()) {
                        SurveyData.Step step = this.this$0.currentStep;
                        if (step == null) {
                            i.m("currentStep");
                            throw null;
                        }
                        if (step.getType() != SurveyData.StepType.THANK_YOU) {
                            SurveyRepository surveyRepository = this.this$0.surveyRepository;
                            String id2 = this.this$0.surveyData.getId();
                            String surveyProgressId2 = this.this$0.surveyData.getSurveyProgressId();
                            this.label = 1;
                            obj = surveyRepository.dismissSurvey(id2, surveyProgressId2, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            if (((NetworkResponse) obj) instanceof NetworkResponse.ClientError) {
                                surveyViewModel = this.this$0;
                                id = surveyViewModel.surveyData.getId();
                                surveyProgressId = this.this$0.surveyData.getSurveyProgressId();
                                this.label = 2;
                                if (surveyViewModel.reportFailure(id, surveyProgressId, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                } else if (i10 == 1) {
                    kotlin.b.b(obj);
                    if (((NetworkResponse) obj) instanceof NetworkResponse.ClientError) {
                        surveyViewModel = this.this$0;
                        id = surveyViewModel.surveyData.getId();
                        surveyProgressId = this.this$0.surveyData.getSurveyProgressId();
                        this.label = 2;
                        if (surveyViewModel.reportFailure(id, surveyProgressId, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return r.f47939a;
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                return ((C04351) create(a10, cVar)).invokeSuspend(r.f47939a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24521(CloseEventTrigger closeEventTrigger, kotlin.coroutines.c<? super C24521> cVar) {
            super(2, cVar);
            this.$triggerType = closeEventTrigger;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return SurveyViewModel.this.new C24521(this.$triggerType, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                SurveyViewModel.this.sendDismissedEvent(this.$triggerType);
                C2680e.c(C2673a0.f43223b, null, null, new C04351(SurveyViewModel.this, null), 3);
                SurveyViewModel.this.intercomDataLayer.clearSurveyData();
                p<SurveyEffects> effects = SurveyViewModel.this.getEffects();
                SurveyEffects.ExitSurvey exitSurvey = SurveyEffects.ExitSurvey.INSTANCE;
                this.label = 1;
                if (effects.emit(exitSurvey, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24521) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onSecondaryCtaClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SurveyViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.survey.SurveyViewModel$onSecondaryCtaClicked$1", f = "SurveyViewModel.kt", l = {304}, m = "invokeSuspend")
    public static final class C24531 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public C24531(kotlin.coroutines.c<? super C24531> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return SurveyViewModel.this.new C24531(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                SurveyRepository surveyRepository = SurveyViewModel.this.surveyRepository;
                String id = SurveyViewModel.this.surveyData.getId();
                String surveyProgressId = SurveyViewModel.this.surveyData.getSurveyProgressId();
                SurveyData.Step step = SurveyViewModel.this.currentStep;
                if (step == null) {
                    i.m("currentStep");
                    throw null;
                }
                StatsCtaRequestModel statsCtaRequestModel = new StatsCtaRequestModel(surveyProgressId, step.getId());
                this.label = 1;
                if (surveyRepository.submitCtaStat(id, statsCtaRequestModel, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24531) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onUiLoaded$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SurveyViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.survey.SurveyViewModel$onUiLoaded$1", f = "SurveyViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C24541 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public C24541(kotlin.coroutines.c<? super C24541> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return SurveyViewModel.this.new C24541(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            SurveyLaunchMode surveyLaunchMode = SurveyViewModel.this.launchMode;
            if (surveyLaunchMode instanceof SurveyLaunchMode.Automatic) {
                SurveyViewModel surveyViewModel = SurveyViewModel.this;
                surveyViewModel.surveyData = ((SurveyLaunchMode.Automatic) surveyViewModel.launchMode).getSurveyData();
                if (SurveyViewModel.this.surveyData.getSteps().isEmpty()) {
                    SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(SurveyViewModel.this.surveyData.getCustomization());
                    SurveyViewModel.this.getState().setValue(new SurveyState.Error.WithoutCTA(0, surveyUiColors, new TopBarState.NoTopBarState(true, surveyUiColors, null, 4, null), 1, null));
                } else {
                    SurveyViewModel.this.metricTracker.surveyOpened("opened", "survey", MetricTracker.Context.FROM_AUTOMATIC, SurveyViewModel.this.surveyData.getId(), SurveyViewModel.this.surveyData.getFormatMetric());
                    SurveyViewModel surveyViewModel2 = SurveyViewModel.this;
                    surveyViewModel2.currentStep = (SurveyData.Step) kotlin.collections.q.O(surveyViewModel2.surveyData.getSteps());
                    q<SurveyState> state = SurveyViewModel.this.getState();
                    SurveyViewModel surveyViewModel3 = SurveyViewModel.this;
                    state.setValue(surveyViewModel3.buildContentState(surveyViewModel3.surveyData));
                }
            } else {
                if (!(surveyLaunchMode instanceof SurveyLaunchMode.Programmatic)) {
                    throw new NoWhenBranchMatchedException();
                }
                SurveyViewModel surveyViewModel4 = SurveyViewModel.this;
                surveyViewModel4.fetchAndShowSurvey(((SurveyLaunchMode.Programmatic) surveyViewModel4.launchMode).getSurveyId());
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24541) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$reportFailure$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SurveyViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.survey.SurveyViewModel", f = "SurveyViewModel.kt", l = {459}, m = "reportFailure")
    public static final class C24551 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24551(kotlin.coroutines.c<? super C24551> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SurveyViewModel.this.reportFailure(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$submitSurvey$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SurveyViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.survey.SurveyViewModel$submitSurvey$1", f = "SurveyViewModel.kt", l = {325, 365, 411}, m = "invokeSuspend")
    public static final class C24561 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ A $compositionAwareScope;
        final /* synthetic */ SurveyState.Content $surveyContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24561(SurveyState.Content content, A a10, kotlin.coroutines.c<? super C24561> cVar) {
            super(2, cVar);
            this.$surveyContent = content;
            this.$compositionAwareScope = a10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invokeSuspend$lambda$7(SurveyViewModel surveyViewModel, SurveyState.Content content, A a10) {
            surveyViewModel.submitSurvey(content, a10);
            return r.f47939a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return SurveyViewModel.this.new C24561(this.$surveyContent, this.$compositionAwareScope, cVar);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0251  */
        /* JADX WARN: Code duplicated, block: B:103:0x0255  */
        /* JADX WARN: Code duplicated, block: B:105:0x025a  */
        /* JADX WARN: Code duplicated, block: B:106:0x029a  */
        /* JADX WARN: Code duplicated, block: B:115:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:117:0x02fd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:77:0x018f  */
        /* JADX WARN: Code duplicated, block: B:79:0x019f  */
        /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:83:0x01af  */
        /* JADX WARN: Code duplicated, block: B:86:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:88:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:90:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:93:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:96:0x01e6 A[LOOP:0: B:94:0x01e0->B:96:0x01e6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:99:0x024d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<String> listK;
            NetworkResponse networkResponse;
            SurveyViewModel surveyViewModel;
            String id;
            String surveyProgressId;
            SubmitSurveyResponse submitSurveyResponse;
            SurveyData.Step step;
            List list;
            SurveyData.Step step2;
            Iterator it;
            int size;
            SurveyData.Step step3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                SurveyData.Step step4 = SurveyViewModel.this.currentStep;
                if (step4 == null) {
                    i.m("currentStep");
                    throw null;
                }
                if (step4.getType() == SurveyData.StepType.THANK_YOU) {
                    SurveyViewModel.this.sendDismissedEvent(CloseEventTrigger.CTA);
                    SurveyViewModel.this.intercomDataLayer.clearSurveyData();
                    p<SurveyEffects> effects = SurveyViewModel.this.getEffects();
                    SurveyEffects.ExitSurvey exitSurvey = SurveyEffects.ExitSurvey.INSTANCE;
                    this.label = 1;
                    if (effects.emit(exitSurvey, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return r.f47939a;
                }
                List<QuestionState> questions = this.$surveyContent.getQuestions();
                if (!questions.isEmpty()) {
                    List<QuestionState> list2 = questions;
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((QuestionState) it2.next()).validate();
                    }
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (!(((QuestionState) it3.next()).getValidationError() instanceof ValidationError.NoValidationError)) {
                                for (QuestionState questionState : list2) {
                                    if (!(questionState.getValidationError() instanceof ValidationError.NoValidationError)) {
                                        A a10 = this.$compositionAwareScope;
                                        if (a10 != null) {
                                            questionState.bringIntoView(a10);
                                        }
                                        return r.f47939a;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                    }
                }
                SurveyViewModel.this.emitLoading();
                List<QuestionState> questions2 = this.$surveyContent.getQuestions();
                ArrayList arrayList = new ArrayList(m.y(questions2, 10));
                for (QuestionState questionState2 : questions2) {
                    String id2 = questionState2.getQuestionModel().getId();
                    Answer answer = questionState2.getAnswer();
                    if (answer instanceof Answer.MultipleAnswer) {
                        listK = ((Answer.MultipleAnswer) answer).getAnswers();
                    } else if (answer instanceof Answer.NoAnswer) {
                        listK = EmptyList.f42983b;
                    } else if (answer instanceof Answer.SingleAnswer) {
                        listK = M1.k(((Answer.SingleAnswer) answer).getAnswer());
                    } else if (answer instanceof Answer.DateTimeAnswer) {
                        listK = EmptyList.f42983b;
                    } else {
                        if (!(answer instanceof Answer.MediaAnswer)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listK = EmptyList.f42983b;
                    }
                    arrayList.add(new SubmitSurveyRequestItem(id2, listK));
                }
                SurveyViewModel.this.completedResponses.addAll(arrayList);
                String surveyProgressId2 = SurveyViewModel.this.surveyData.getSurveyProgressId();
                SurveyData.Step step5 = SurveyViewModel.this.currentStep;
                if (step5 == null) {
                    i.m("currentStep");
                    throw null;
                }
                SubmitSurveyRequest submitSurveyRequest = new SubmitSurveyRequest(surveyProgressId2, step5.getId(), SurveyViewModel.this.completedResponses);
                SurveyRepository surveyRepository = SurveyViewModel.this.surveyRepository;
                String id3 = SurveyViewModel.this.surveyData.getId();
                this.label = 2;
                obj = surveyRepository.submitSurvey(submitSurveyRequest, id3, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                networkResponse = (NetworkResponse) obj;
                if (networkResponse instanceof NetworkResponse.Success) {
                    submitSurveyResponse = (SubmitSurveyResponse) ((NetworkResponse.Success) networkResponse).getBody();
                    step = SurveyViewModel.this.currentStep;
                    if (step != null) {
                        i.m("currentStep");
                        throw null;
                    }
                    if (step.getType() == SurveyData.StepType.QUESTION) {
                        list = SurveyViewModel.this.completedSteps;
                        step2 = SurveyViewModel.this.currentStep;
                        if (step2 != null) {
                            i.m("currentStep");
                            throw null;
                        }
                        list.add(step2);
                    } else {
                        step3 = SurveyViewModel.this.currentStep;
                        if (step3 != null) {
                            i.m("currentStep");
                            throw null;
                        }
                        if (step3.getType() == SurveyData.StepType.CONTENT) {
                            list = SurveyViewModel.this.completedSteps;
                            step2 = SurveyViewModel.this.currentStep;
                            if (step2 != null) {
                                i.m("currentStep");
                                throw null;
                            }
                            list.add(step2);
                        }
                    }
                    if (submitSurveyResponse.getComplete()) {
                        it = SurveyViewModel.this.completedSteps.iterator();
                        size = 0;
                        while (it.hasNext()) {
                            size += ((SurveyData.Step) it.next()).getQuestions().size();
                        }
                        SurveyViewModel.this.metricTracker.surveyCompleted(MetricTracker.Action.COMPLETED, "survey", MetricTracker.Context.FROM_CTA, SurveyViewModel.this.surveyData.getId(), SurveyViewModel.this.surveyData.getFormatMetric(), SurveyViewModel.this.completedSteps.size(), SurveyViewModel.this.surveyData.getStepCount(), size);
                    }
                    SurveyViewModel.this.currentStep = submitSurveyResponse.getNextStep();
                    q<SurveyState> state = SurveyViewModel.this.getState();
                    SurveyViewModel surveyViewModel2 = SurveyViewModel.this;
                    state.setValue(surveyViewModel2.buildContentState(surveyViewModel2.surveyData));
                } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                    q<SurveyState> state2 = SurveyViewModel.this.getState();
                    SurveyUiColors surveyUiColors = this.$surveyContent.getSurveyUiColors();
                    TopBarState topBarStateEnableDismissButton = this.$surveyContent.getTopBarState().withProgressBarState(ProgressBarState.copy$default(this.$surveyContent.getTopBarState().getProgressBarState(), false, 0.0f, 2, null)).enableDismissButton();
                    final SurveyViewModel surveyViewModel3 = SurveyViewModel.this;
                    final SurveyState.Content content = this.$surveyContent;
                    final A a11 = this.$compositionAwareScope;
                    state2.setValue(new SurveyState.Error.WithCTA(0, surveyUiColors, topBarStateEnableDismissButton, new Ia.a() { // from class: io.intercom.android.sdk.survey.b
                        @Override // Ia.a
                        public final Object invoke() {
                            return SurveyViewModel.C24561.invokeSuspend$lambda$7(surveyViewModel3, content, a11);
                        }
                    }, 1, null));
                } else {
                    if (networkResponse instanceof NetworkResponse.ServerError) {
                    }
                    SurveyViewModel.this.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$surveyContent.getSurveyUiColors(), this.$surveyContent.getTopBarState().withProgressBarState(ProgressBarState.copy$default(this.$surveyContent.getTopBarState().getProgressBarState(), false, 0.0f, 2, null)).enableDismissButton(), 1, null));
                    if (networkResponse instanceof NetworkResponse.ClientError) {
                        surveyViewModel = SurveyViewModel.this;
                        id = surveyViewModel.surveyData.getId();
                        surveyProgressId = SurveyViewModel.this.surveyData.getSurveyProgressId();
                        this.label = 3;
                        if (surveyViewModel.reportFailure(id, surveyProgressId, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            } else {
                if (i10 == 1) {
                    kotlin.b.b(obj);
                    return r.f47939a;
                }
                if (i10 == 2) {
                    kotlin.b.b(obj);
                    networkResponse = (NetworkResponse) obj;
                    if (networkResponse instanceof NetworkResponse.Success) {
                        submitSurveyResponse = (SubmitSurveyResponse) ((NetworkResponse.Success) networkResponse).getBody();
                        step = SurveyViewModel.this.currentStep;
                        if (step != null) {
                            i.m("currentStep");
                            throw null;
                        }
                        if (step.getType() == SurveyData.StepType.QUESTION) {
                            list = SurveyViewModel.this.completedSteps;
                            step2 = SurveyViewModel.this.currentStep;
                            if (step2 != null) {
                                i.m("currentStep");
                                throw null;
                            }
                            list.add(step2);
                        } else {
                            step3 = SurveyViewModel.this.currentStep;
                            if (step3 != null) {
                                i.m("currentStep");
                                throw null;
                            }
                            if (step3.getType() == SurveyData.StepType.CONTENT) {
                                list = SurveyViewModel.this.completedSteps;
                                step2 = SurveyViewModel.this.currentStep;
                                if (step2 != null) {
                                    i.m("currentStep");
                                    throw null;
                                }
                                list.add(step2);
                            }
                        }
                        if (submitSurveyResponse.getComplete()) {
                            it = SurveyViewModel.this.completedSteps.iterator();
                            size = 0;
                            while (it.hasNext()) {
                                size += ((SurveyData.Step) it.next()).getQuestions().size();
                            }
                            SurveyViewModel.this.metricTracker.surveyCompleted(MetricTracker.Action.COMPLETED, "survey", MetricTracker.Context.FROM_CTA, SurveyViewModel.this.surveyData.getId(), SurveyViewModel.this.surveyData.getFormatMetric(), SurveyViewModel.this.completedSteps.size(), SurveyViewModel.this.surveyData.getStepCount(), size);
                        }
                        SurveyViewModel.this.currentStep = submitSurveyResponse.getNextStep();
                        q<SurveyState> state3 = SurveyViewModel.this.getState();
                        SurveyViewModel surveyViewModel4 = SurveyViewModel.this;
                        state3.setValue(surveyViewModel4.buildContentState(surveyViewModel4.surveyData));
                    } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                        q<SurveyState> state4 = SurveyViewModel.this.getState();
                        SurveyUiColors surveyUiColors2 = this.$surveyContent.getSurveyUiColors();
                        TopBarState topBarStateEnableDismissButton2 = this.$surveyContent.getTopBarState().withProgressBarState(ProgressBarState.copy$default(this.$surveyContent.getTopBarState().getProgressBarState(), false, 0.0f, 2, null)).enableDismissButton();
                        final SurveyViewModel surveyViewModel5 = SurveyViewModel.this;
                        final SurveyState.Content content2 = this.$surveyContent;
                        final A a12 = this.$compositionAwareScope;
                        state4.setValue(new SurveyState.Error.WithCTA(0, surveyUiColors2, topBarStateEnableDismissButton2, new Ia.a() { // from class: io.intercom.android.sdk.survey.b
                            @Override // Ia.a
                            public final Object invoke() {
                                return SurveyViewModel.C24561.invokeSuspend$lambda$7(surveyViewModel5, content2, a12);
                            }
                        }, 1, null));
                    } else {
                        if ((networkResponse instanceof NetworkResponse.ServerError) && !(networkResponse instanceof NetworkResponse.ClientError)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SurveyViewModel.this.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$surveyContent.getSurveyUiColors(), this.$surveyContent.getTopBarState().withProgressBarState(ProgressBarState.copy$default(this.$surveyContent.getTopBarState().getProgressBarState(), false, 0.0f, 2, null)).enableDismissButton(), 1, null));
                        if (networkResponse instanceof NetworkResponse.ClientError) {
                            surveyViewModel = SurveyViewModel.this;
                            id = surveyViewModel.surveyData.getId();
                            surveyProgressId = SurveyViewModel.this.surveyData.getSurveyProgressId();
                            this.label = 3;
                            if (surveyViewModel.reportFailure(id, surveyProgressId, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24561) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyViewModel(AbstractC2712w abstractC2712w, SurveyLaunchMode surveyLaunchMode, SurveyRepository surveyRepository, AppConfig appConfig, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer, int i10, e eVar) {
        this((i10 & 1) != 0 ? N.f43200c : abstractC2712w, surveyLaunchMode, (i10 & 4) != 0 ? new SurveyRepository(null, 1, 0 == true ? 1 : 0) : surveyRepository, (i10 & 8) != 0 ? (AppConfig) o.b() : appConfig, (i10 & 16) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i10 & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    public final SurveyState.Content buildContentState(SurveyData surveyData) {
        boolean z10;
        TopBarState senderTopBarState;
        SurveyState.Content.PrimaryCta.Fallback fallback;
        SurveyState.Content.PrimaryCta.Custom custom;
        SurveyState.Content.PrimaryCta primaryCta;
        SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(surveyData.getCustomization());
        float stepCount = surveyData.getStepCount();
        int size = this.completedSteps.size();
        if (surveyData.getShowProgressBar()) {
            SurveyData.Step step = this.currentStep;
            if (step == null) {
                i.m("currentStep");
                throw null;
            }
            if (step.getType() != SurveyData.StepType.CONTENT) {
                SurveyData.Step step2 = this.currentStep;
                if (step2 == null) {
                    i.m("currentStep");
                    throw null;
                }
                if (step2.getType() != SurveyData.StepType.QUESTION) {
                    z10 = false;
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        ProgressBarState progressBarState = new ProgressBarState(z10, size / stepCount);
        SurveySenderData sender = surveyData.getSender();
        if ((sender != null ? sender.getName() : null) == null) {
            senderTopBarState = new TopBarState.NoTopBarState(surveyData.isDismissible(), surveyUiColors, progressBarState);
        } else {
            Avatar.Builder builder = new Avatar.Builder();
            SurveySenderAvatar avatar = surveyData.getSender().getAvatar();
            Avatar avatarBuild = builder.withImageUrl(avatar != null ? avatar.getSquareImg128() : null).withInitials(surveyData.getSender().getInitials()).build();
            i.d(avatarBuild, "build(...)");
            String firstName = surveyData.getSender().getFirstName();
            if (firstName == null) {
                firstName = surveyData.getSender().getName();
            }
            senderTopBarState = new TopBarState.SenderTopBarState(avatarBuild, firstName, this.appConfig, surveyData.isDismissible(), surveyUiColors, progressBarState);
        }
        SurveyData.Step step3 = this.currentStep;
        if (step3 == null) {
            i.m("currentStep");
            throw null;
        }
        String customButtonText = step3.getCustomButtonText();
        SurveyData.Step step4 = this.currentStep;
        if (step4 == null) {
            i.m("currentStep");
            throw null;
        }
        List<Block.Builder> blocks = step4.getBlocks();
        SurveyData.Step step5 = this.currentStep;
        if (step5 == null) {
            i.m("currentStep");
            throw null;
        }
        List<SurveyData.Step.Question> questions = step5.getQuestions();
        ArrayList arrayList = new ArrayList(m.y(questions, 10));
        Iterator<T> it = questions.iterator();
        while (it.hasNext()) {
            arrayList.add(new QuestionState(((SurveyData.Step.Question) it.next()).getQuestionModel(), surveyUiColors));
        }
        SurveyData.Step step6 = this.currentStep;
        if (step6 == null) {
            i.m("currentStep");
            throw null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[step6.getType().ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                if (customButtonText == null || customButtonText.length() == 0) {
                    fallback = new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button);
                    primaryCta = fallback;
                } else {
                    custom = new SurveyState.Content.PrimaryCta.Custom(customButtonText);
                    primaryCta = custom;
                }
            } else if (i10 != 4) {
                if (customButtonText == null || customButtonText.length() == 0) {
                    fallback = new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button);
                    primaryCta = fallback;
                } else {
                    custom = new SurveyState.Content.PrimaryCta.Custom(customButtonText);
                    primaryCta = custom;
                }
            } else if (customButtonText == null || customButtonText.length() == 0) {
                fallback = new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_done_button);
                primaryCta = fallback;
            } else {
                custom = new SurveyState.Content.PrimaryCta.Custom(customButtonText);
                primaryCta = custom;
            }
        } else if (customButtonText == null || customButtonText.length() == 0) {
            fallback = new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_submit);
            primaryCta = fallback;
        } else {
            custom = new SurveyState.Content.PrimaryCta.Custom(customButtonText);
            primaryCta = custom;
        }
        SurveyData.Step step7 = this.currentStep;
        if (step7 == null) {
            i.m("currentStep");
            throw null;
        }
        List<SurveyData.SurveyActions> actions = step7.getActions();
        ArrayList arrayList2 = new ArrayList(m.y(actions, 10));
        for (SurveyData.SurveyActions surveyActions : actions) {
            boolean z11 = surveyActions.getAndroidUri() == null;
            String webUrl = z11 ? surveyActions.getWebUrl() : surveyActions.getAndroidUri();
            String actionTitle = surveyActions.getActionTitle();
            if (webUrl == null) {
                webUrl = "";
            }
            arrayList2.add(new SurveyState.Content.SecondaryCta(actionTitle, webUrl, z11));
        }
        return new SurveyState.Content(blocks, arrayList, arrayList2, primaryCta, surveyUiColors, senderTopBarState);
    }

    public static /* synthetic */ void continueClicked$default(SurveyViewModel surveyViewModel, A a10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a10 = null;
        }
        surveyViewModel.continueClicked(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitLoading() {
        q<SurveyState> qVar = this.state;
        qVar.setValue(new SurveyState.Loading(this.state.getValue().getSurveyUiColors(), qVar.getValue().getTopBarState()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchAndShowSurvey(String str) {
        C2680e.c(Z.a(this), this.dispatcher, null, new AnonymousClass1(str, this, SurveyViewModelKt.toSurveyUiColors(this.surveyData.getCustomization()), null), 2);
    }

    private final SurveyState.Content getCurrentContentState() {
        SurveyState value = this.state.getValue();
        i.c(value, "null cannot be cast to non-null type io.intercom.android.sdk.survey.SurveyState.Content");
        return (SurveyState.Content) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object reportFailure(String str, String str2, kotlin.coroutines.c<? super r> cVar) {
        C24551 c24551;
        if (cVar instanceof C24551) {
            c24551 = (C24551) cVar;
            int i10 = c24551.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c24551.label = i10 - Integer.MIN_VALUE;
            } else {
                c24551 = new C24551(cVar);
            }
        } else {
            c24551 = new C24551(cVar);
        }
        Object objReportFailure = c24551.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = c24551.label;
        if (i11 == 0) {
            kotlin.b.b(objReportFailure);
            SurveyRepository surveyRepository = this.surveyRepository;
            c24551.label = 1;
            objReportFailure = surveyRepository.reportFailure(str, str2, c24551);
            if (objReportFailure == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objReportFailure);
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDismissedEvent(CloseEventTrigger closeEventTrigger) {
        String str;
        String str2;
        SurveyState value = this.state.getValue();
        if (value instanceof SurveyState.Loading) {
            str = MetricTracker.Object.SURVEY_STEP_LOADING;
        } else {
            str = value instanceof SurveyState.Error ? MetricTracker.Object.SURVEY_STEP_ERROR : "survey";
        }
        String str3 = str;
        int i10 = WhenMappings.$EnumSwitchMapping$1[closeEventTrigger.ordinal()];
        if (i10 == 1) {
            str2 = MetricTracker.Context.FROM_CTA;
        } else if (i10 == 2) {
            str2 = MetricTracker.Context.FROM_CLOSE_BUTTON;
        } else if (i10 == 3) {
            str2 = MetricTracker.Context.FROM_ONWARD_EXTERNAL_LINK;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = MetricTracker.Context.FROM_ONWARD_DEEP_LINK;
        }
        String str4 = str2;
        if (this.surveyData.getSteps().isEmpty()) {
            return;
        }
        SurveyData.Step step = this.currentStep;
        if (step == null) {
            i.m("currentStep");
            throw null;
        }
        String str5 = step.getType() == SurveyData.StepType.THANK_YOU ? MetricTracker.Action.CLOSED : MetricTracker.Action.DISMISSED;
        Iterator<T> it = this.completedSteps.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((SurveyData.Step) it.next()).getQuestions().size();
        }
        SurveyData.Step step2 = this.currentStep;
        if (step2 != null) {
            this.metricTracker.surveyDismissed(str5, str3, str4, this.surveyData.getId(), this.surveyData.getFormatMetric(), this.completedSteps.size(), this.surveyData.getStepCount(), step2.getQuestions().size() + size);
        } else {
            i.m("currentStep");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitSurvey(SurveyState.Content content, A a10) {
        C2680e.c(Z.a(this), this.dispatcher, null, new C24561(content, a10, null), 2);
    }

    public static /* synthetic */ void submitSurvey$default(SurveyViewModel surveyViewModel, SurveyState.Content content, A a10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            a10 = null;
        }
        surveyViewModel.submitSurvey(content, a10);
    }

    public final void continueClicked(A a10) {
        submitSurvey(getCurrentContentState(), a10);
    }

    public final AbstractC2712w getDispatcher() {
        return this.dispatcher;
    }

    public final p<SurveyEffects> getEffects() {
        return this.effects;
    }

    public final q<SurveyState> getState() {
        return this.state;
    }

    public final void onAnswerUpdated() {
        int i10;
        SurveyState.Content currentContentState = getCurrentContentState();
        float stepCount = this.surveyData.getStepCount();
        int size = this.completedSteps.size();
        List<QuestionState> questions = currentContentState.getQuestions();
        if ((questions instanceof Collection) && questions.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = questions.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if ((((QuestionState) it.next()).getValidationError() instanceof ValidationError.NoValidationError) && (i10 = i10 + 1) < 0) {
                    kotlin.collections.l.w();
                    throw null;
                }
            }
        }
        float f10 = size / stepCount;
        float f11 = i10;
        SurveyData.Step step = this.currentStep;
        if (step != null) {
            this.state.setValue(SurveyState.Content.copy$default(currentContentState, null, null, null, null, null, currentContentState.getTopBarState().withProgressBarState(ProgressBarState.copy$default(currentContentState.getTopBarState().getProgressBarState(), false, (f11 / (stepCount * step.getQuestions().size())) + f10, 1, null)), 31, null));
        } else {
            i.m("currentStep");
            throw null;
        }
    }

    public final void onCloseClicked(CloseEventTrigger triggerType) {
        i.e(triggerType, "triggerType");
        if (this.surveyData.isDismissible() || (this.state.getValue() instanceof SurveyState.Error)) {
            C2680e.c(Z.a(this), null, null, new C24521(triggerType, null), 3);
        }
    }

    public final void onSecondaryCtaClicked(SurveyState.Content.SecondaryCta secondaryCta) {
        i.e(secondaryCta, "secondaryCta");
        CloseEventTrigger closeEventTrigger = secondaryCta.isExternalUrl() ? CloseEventTrigger.SECONDARY_CTA_EXTERNAL_LINK : CloseEventTrigger.SECONDARY_CTA_DEEP_LINK;
        if (closeEventTrigger == CloseEventTrigger.SECONDARY_CTA_DEEP_LINK) {
            C2680e.c(C2673a0.f43223b, null, null, new C24531(null), 3);
        }
        onCloseClicked(closeEventTrigger);
    }

    public final void onUiLoaded() {
        if (i.a(this.state.getValue(), SurveyState.Initial.INSTANCE)) {
            C2680e.c(Z.a(this), this.dispatcher, null, new C24541(null), 2);
        }
    }

    public SurveyViewModel(AbstractC2712w dispatcher, SurveyLaunchMode launchMode, SurveyRepository surveyRepository, AppConfig appConfig, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer) {
        i.e(dispatcher, "dispatcher");
        i.e(launchMode, "launchMode");
        i.e(surveyRepository, "surveyRepository");
        i.e(appConfig, "appConfig");
        i.e(metricTracker, "metricTracker");
        i.e(intercomDataLayer, "intercomDataLayer");
        this.dispatcher = dispatcher;
        this.launchMode = launchMode;
        this.surveyRepository = surveyRepository;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.intercomDataLayer = intercomDataLayer;
        this.surveyData = SurveyData.Companion.getNULL();
        this.state = B.a(SurveyState.Initial.INSTANCE);
        this.effects = w.b(0, 0, null, 7);
        this.completedResponses = new ArrayList();
        this.completedSteps = new ArrayList();
    }
}
