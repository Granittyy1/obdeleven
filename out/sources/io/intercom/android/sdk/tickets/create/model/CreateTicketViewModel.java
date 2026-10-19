package io.intercom.android.sdk.tickets.create.model;

import Z3.o;
import android.content.Context;
import android.webkit.MimeTypeMap;
import androidx.compose.animation.D;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.create.reducers.ConditionalAttributesReducerKt;
import io.intercom.android.sdk.tickets.create.reducers.CreateTicketReducerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.A;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.q;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.flow.w;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: CreateTicketViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketViewModel extends Y {
    private final p<TicketSideEffect> _effect;
    private final q<CreateTicketFormUiState> _uiState;
    private final Context applicationContext;
    private final AppConfig config;
    private final String conversationId;
    private TicketTypeV2 currentTicketType;
    private final AbstractC2712w dispatcher;
    private final u<TicketSideEffect> effect;
    private CreateTicketFormUiState.Content lastKnownContentState;
    private final CreateTicketLaunchedFrom launchedFrom;
    private final MetricTracker metricTracker;
    private final TicketRepository ticketRepository;
    private final int ticketTypeId;
    private final A<CreateTicketFormUiState> uiState;
    private final UserIdentity userIdentity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: CreateTicketViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$1", f = "CreateTicketViewModel.kt", l = {R.styleable.AppCompatTheme_panelBackground}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return CreateTicketViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                q qVar = CreateTicketViewModel.this._uiState;
                final CreateTicketViewModel createTicketViewModel = CreateTicketViewModel.this;
                InterfaceC2687d interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((CreateTicketFormUiState) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(CreateTicketFormUiState createTicketFormUiState, kotlin.coroutines.c<? super r> cVar) {
                        if (createTicketFormUiState instanceof CreateTicketFormUiState.Content) {
                            createTicketViewModel.lastKnownContentState = (CreateTicketFormUiState.Content) createTicketFormUiState;
                        }
                        return r.f47939a;
                    }
                };
                this.label = 1;
                if (qVar.collect(interfaceC2687d, this) == coroutineSingletons) {
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
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: compiled from: CreateTicketViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$Companion$factory$1] */
        private final CreateTicketViewModel$Companion$factory$1 factory(final int i10, final String str, final CreateTicketLaunchedFrom createTicketLaunchedFrom) {
            return new a0.c() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$Companion$factory$1
                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Oa.c cVar, p014b1.a aVar) {
                    return super.create(cVar, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Class cls, p014b1.a aVar) {
                    return super.create(cls, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public <T extends Y> T create(Class<T> modelClass) {
                    i.e(modelClass, "modelClass");
                    return new CreateTicketViewModel(createTicketLaunchedFrom, null, null, null, null, null, str, i10, null, 318, null);
                }
            };
        }

        public final CreateTicketViewModel create(c0 owner, int i10, String str, CreateTicketLaunchedFrom launchedFrom) {
            i.e(owner, "owner");
            i.e(launchedFrom, "launchedFrom");
            CreateTicketViewModel$Companion$factory$1 factory = factory(i10, str, launchedFrom);
            i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            p014b1.a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b;
            i.e(store, "store");
            i.e(defaultCreationExtras, "defaultCreationExtras");
            p014b1.f fVar = new p014b1.f(store, factory, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = l.a(CreateTicketViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (CreateTicketViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: CreateTicketViewModel.kt */
    public static abstract class CreateTicketFormUiState {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: CreateTicketViewModel.kt */
        public static final class Content extends CreateTicketFormUiState {
            public static final int $stable = 8;
            private final boolean enableCta;
            private final List<QuestionState> questions;
            private final boolean showCreatingTicketProgress;
            private final String title;

            public /* synthetic */ Content(String str, List list, boolean z10, boolean z11, int i10, kotlin.jvm.internal.e eVar) {
                this(str, list, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? true : z11);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Content copy$default(Content content, String str, List list, boolean z10, boolean z11, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = content.title;
                }
                if ((i10 & 2) != 0) {
                    list = content.questions;
                }
                if ((i10 & 4) != 0) {
                    z10 = content.showCreatingTicketProgress;
                }
                if ((i10 & 8) != 0) {
                    z11 = content.enableCta;
                }
                return content.copy(str, list, z10, z11);
            }

            public final String component1() {
                return this.title;
            }

            public final List<QuestionState> component2() {
                return this.questions;
            }

            public final boolean component3() {
                return this.showCreatingTicketProgress;
            }

            public final boolean component4() {
                return this.enableCta;
            }

            public final Content copy(String title, List<QuestionState> questions, boolean z10, boolean z11) {
                i.e(title, "title");
                i.e(questions, "questions");
                return new Content(title, questions, z10, z11);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return i.a(this.title, content.title) && i.a(this.questions, content.questions) && this.showCreatingTicketProgress == content.showCreatingTicketProgress && this.enableCta == content.enableCta;
            }

            public final boolean getEnableCta() {
                return this.enableCta;
            }

            public final List<QuestionState> getQuestions() {
                return this.questions;
            }

            public final boolean getShowCreatingTicketProgress() {
                return this.showCreatingTicketProgress;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return Boolean.hashCode(this.enableCta) + D.b(p005a4.p.d(this.title.hashCode() * 31, 31, this.questions), 31, this.showCreatingTicketProgress);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Content(title=");
                sb2.append(this.title);
                sb2.append(", questions=");
                sb2.append(this.questions);
                sb2.append(", showCreatingTicketProgress=");
                sb2.append(this.showCreatingTicketProgress);
                sb2.append(", enableCta=");
                return o.d(sb2, this.enableCta, ')');
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Content(String title, List<QuestionState> questions, boolean z10, boolean z11) {
                super(null);
                i.e(title, "title");
                i.e(questions, "questions");
                this.title = title;
                this.questions = questions;
                this.showCreatingTicketProgress = z10;
                this.enableCta = z11;
            }
        }

        /* JADX INFO: compiled from: CreateTicketViewModel.kt */
        public static final class Error extends CreateTicketFormUiState {
            public static final int $stable = 0;
            private final ErrorState errorState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(ErrorState errorState) {
                super(null);
                i.e(errorState, "errorState");
                this.errorState = errorState;
            }

            public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    errorState = error.errorState;
                }
                return error.copy(errorState);
            }

            public final ErrorState component1() {
                return this.errorState;
            }

            public final Error copy(ErrorState errorState) {
                i.e(errorState, "errorState");
                return new Error(errorState);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && i.a(this.errorState, ((Error) obj).errorState);
            }

            public final ErrorState getErrorState() {
                return this.errorState;
            }

            public int hashCode() {
                return this.errorState.hashCode();
            }

            public String toString() {
                return "Error(errorState=" + this.errorState + ')';
            }
        }

        /* JADX INFO: compiled from: CreateTicketViewModel.kt */
        public static final class Initial extends CreateTicketFormUiState {
            public static final int $stable = 0;
            public static final Initial INSTANCE = new Initial();

            private Initial() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Initial);
            }

            public int hashCode() {
                return 1870846745;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: compiled from: CreateTicketViewModel.kt */
        public static final class Loading extends CreateTicketFormUiState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public int hashCode() {
                return 259155217;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ CreateTicketFormUiState(kotlin.jvm.internal.e eVar) {
            this();
        }

        private CreateTicketFormUiState() {
        }
    }

    /* JADX INFO: compiled from: CreateTicketViewModel.kt */
    public static abstract class TicketSideEffect {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: CreateTicketViewModel.kt */
        public static final class AnswerClicked extends TicketSideEffect {
            public static final int $stable = 8;
            private final AnswerClickData answerClickData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnswerClicked(AnswerClickData answerClickData) {
                super(null);
                i.e(answerClickData, "answerClickData");
                this.answerClickData = answerClickData;
            }

            public static /* synthetic */ AnswerClicked copy$default(AnswerClicked answerClicked, AnswerClickData answerClickData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    answerClickData = answerClicked.answerClickData;
                }
                return answerClicked.copy(answerClickData);
            }

            public final AnswerClickData component1() {
                return this.answerClickData;
            }

            public final AnswerClicked copy(AnswerClickData answerClickData) {
                i.e(answerClickData, "answerClickData");
                return new AnswerClicked(answerClickData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AnswerClicked) && i.a(this.answerClickData, ((AnswerClicked) obj).answerClickData);
            }

            public final AnswerClickData getAnswerClickData() {
                return this.answerClickData;
            }

            public int hashCode() {
                return this.answerClickData.hashCode();
            }

            public String toString() {
                return "AnswerClicked(answerClickData=" + this.answerClickData + ')';
            }
        }

        /* JADX INFO: compiled from: CreateTicketViewModel.kt */
        public static final class Finish extends TicketSideEffect {
            public static final int $stable = 0;
            public static final Finish INSTANCE = new Finish();

            private Finish() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Finish);
            }

            public int hashCode() {
                return -1916377057;
            }

            public String toString() {
                return "Finish";
            }
        }

        public /* synthetic */ TicketSideEffect(kotlin.jvm.internal.e eVar) {
            this();
        }

        private TicketSideEffect() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CreateTicketViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1", f = "CreateTicketViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C24661 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ List<Answer.MediaAnswer.MediaItem> $mediaItems;
        int label;
        final /* synthetic */ CreateTicketViewModel this$0;

        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: CreateTicketViewModel.kt */
        @Aa.c(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1$1", f = "CreateTicketViewModel.kt", l = {358, 378}, m = "invokeSuspend")
        public static final class C04491 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
            final /* synthetic */ List<Answer.MediaAnswer.MediaItem> $itemsToUpload;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ CreateTicketViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04491(List<Answer.MediaAnswer.MediaItem> list, CreateTicketViewModel createTicketViewModel, kotlin.coroutines.c<? super C04491> cVar) {
                super(2, cVar);
                this.$itemsToUpload = list;
                this.this$0 = createTicketViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C04491(this.$itemsToUpload, this.this$0, cVar);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0059  */
            /* JADX WARN: Code duplicated, block: B:15:0x0077 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:16:0x0078  */
            /* JADX WARN: Code duplicated, block: B:19:0x0086  */
            /* JADX WARN: Code duplicated, block: B:20:0x00c3  */
            /* JADX WARN: Code duplicated, block: B:22:0x00d7 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:23:0x00d8  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:11:0x0053). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d8 -> B:24:0x00dd). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 312
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.C24661.C04491.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // Ia.p
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
                return ((C04491) create(a10, cVar)).invokeSuspend(r.f47939a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24661(List<Answer.MediaAnswer.MediaItem> list, CreateTicketViewModel createTicketViewModel, kotlin.coroutines.c<? super C24661> cVar) {
            super(2, cVar);
            this.$mediaItems = list;
            this.this$0 = createTicketViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new C24661(this.$mediaItems, this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            List<Answer.MediaAnswer.MediaItem> list = this.$mediaItems;
            ArrayList<Answer.MediaAnswer.MediaItem> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (i.a(((Answer.MediaAnswer.MediaItem) obj2).getUploadStatus(), Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(m.y(arrayList, 10));
            for (Answer.MediaAnswer.MediaItem mediaItem : arrayList) {
                mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE);
                arrayList2.add(mediaItem);
            }
            C2680e.c(Z.a(this.this$0), this.this$0.dispatcher, null, new C04491(arrayList2, this.this$0, null), 2);
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24661) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$fetchTicketType$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CreateTicketViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$fetchTicketType$1", f = "CreateTicketViewModel.kt", l = {105}, m = "invokeSuspend")
    public static final class C24671 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ List<TicketAttributeRequest> $attributes;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24671(List<TicketAttributeRequest> list, kotlin.coroutines.c<? super C24671> cVar) {
            super(2, cVar);
            this.$attributes = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invokeSuspend$lambda$0(CreateTicketViewModel createTicketViewModel, List list) {
            createTicketViewModel.fetchTicketType(list);
            return r.f47939a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return CreateTicketViewModel.this.new C24671(this.$attributes, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q qVar;
            Object error;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                q qVar2 = CreateTicketViewModel.this._uiState;
                TicketRepository ticketRepository = CreateTicketViewModel.this.ticketRepository;
                int i11 = CreateTicketViewModel.this.ticketTypeId;
                List<TicketAttributeRequest> list = this.$attributes;
                this.L$0 = qVar2;
                this.label = 1;
                Object objFetchTicketType = ticketRepository.fetchTicketType(i11, list, this);
                if (objFetchTicketType == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qVar = qVar2;
                obj = objFetchTicketType;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.L$0;
                kotlin.b.b(obj);
            }
            NetworkResponse networkResponse = (NetworkResponse) obj;
            if (networkResponse instanceof NetworkResponse.Success) {
                TicketTypeV2 ticketTypeV2 = (TicketTypeV2) ((NetworkResponse.Success) networkResponse).getBody();
                CreateTicketViewModel.this.currentTicketType = ticketTypeV2;
                error = CreateTicketReducerKt.convertToTicketFormUiState(ticketTypeV2, CreateTicketViewModel.this.userIdentity, CreateTicketViewModel.this.config, CreateTicketViewModel.this.getLastKnownContent());
            } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                error = new CreateTicketFormUiState.Error(new ErrorState.WithoutCTA(0, 0, new Integer(io.intercom.android.sdk.R.string.intercom_error_loading_ticket), 3, null));
            } else {
                if (!(networkResponse instanceof NetworkResponse.NetworkError)) {
                    throw new NoWhenBranchMatchedException();
                }
                Integer num = new Integer(io.intercom.android.sdk.R.string.intercom_error_loading_ticket);
                final CreateTicketViewModel createTicketViewModel = CreateTicketViewModel.this;
                final List<TicketAttributeRequest> list2 = this.$attributes;
                error = new CreateTicketFormUiState.Error(new ErrorState.WithCTA(0, 0, num, 0, new Ia.a() { // from class: io.intercom.android.sdk.tickets.create.model.h
                    @Override // Ia.a
                    public final Object invoke() {
                        return CreateTicketViewModel.C24671.invokeSuspend$lambda$0(createTicketViewModel, list2);
                    }
                }, 11, null));
            }
            qVar.setValue(error);
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24671) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CreateTicketViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerClicked$1", f = "CreateTicketViewModel.kt", l = {413}, m = "invokeSuspend")
    public static final class C24681 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ AnswerClickData $answerClickData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24681(AnswerClickData answerClickData, kotlin.coroutines.c<? super C24681> cVar) {
            super(2, cVar);
            this.$answerClickData = answerClickData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return CreateTicketViewModel.this.new C24681(this.$answerClickData, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                p pVar = CreateTicketViewModel.this._effect;
                TicketSideEffect.AnswerClicked answerClicked = new TicketSideEffect.AnswerClicked(this.$answerClickData);
                this.label = 1;
                if (pVar.emit(answerClicked, this) == coroutineSingletons) {
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
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24681) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public CreateTicketViewModel(CreateTicketLaunchedFrom createTicketLaunchedFrom, TicketRepository ticketRepository, UserIdentity userIdentity, AppConfig appConfig, AbstractC2712w abstractC2712w, MetricTracker metricTracker, String str, int i10, Context context, int i11, kotlin.jvm.internal.e eVar) {
        this(createTicketLaunchedFrom, (i11 & 2) != 0 ? new TicketRepository(null, null, null, null, 15, null) : ticketRepository, (i11 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i11 & 8) != 0 ? (AppConfig) o.b() : appConfig, (i11 & 16) != 0 ? N.f43200c : abstractC2712w, (i11 & 32) != 0 ? Injector.get().getMetricTracker() : metricTracker, str, i10, (i11 & 256) != 0 ? Injector.get().getApplication() : context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canRetryFileLimitExceededError(Answer.MediaAnswer.MediaItem mediaItem, int i10, int i11) {
        if (mediaItem.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
            Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
            i.c(uploadStatus, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error");
            if ((((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError() instanceof Answer.MediaAnswer.FileUploadError.FileLimitExceeded) && i10 < i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void compressAndUploadFileAttachments(List<Answer.MediaAnswer.MediaItem> list) {
        C2680e.c(Z.a(this), this.dispatcher, null, new C24661(list, this, null), 2);
    }

    public static /* synthetic */ void createTicket$default(CreateTicketViewModel createTicketViewModel, kotlinx.coroutines.A a10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a10 = null;
        }
        createTicketViewModel.createTicket(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r createTicket$lambda$0(CreateTicketViewModel this$0, kotlinx.coroutines.A a10, CreateTicketFormUiState.Content content) {
        i.e(this$0, "this$0");
        i.e(content, "content");
        C2680e.c(Z.a(this$0), this$0.dispatcher, null, new CreateTicketViewModel$createTicket$1$1(content, this$0, a10, null), 2);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchTicketType(List<TicketAttributeRequest> list) {
        C2680e.c(Z.a(this), this.dispatcher, null, new C24671(list, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void fetchTicketType$default(CreateTicketViewModel createTicketViewModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = EmptyList.f42983b;
        }
        createTicketViewModel.fetchTicketType(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TicketAttributeRequest> getAttributeRequest() {
        ArrayList arrayList = new ArrayList();
        withState(new coil.compose.i(2, arrayList));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r getAttributeRequest$lambda$6(List list, CreateTicketFormUiState.Content content) {
        i.e(list, "$list");
        i.e(content, "content");
        List<QuestionState> questions = content.getQuestions();
        ArrayList<QuestionState> arrayList = new ArrayList();
        for (Object obj : questions) {
            if (!i.a(((QuestionState) obj).getQuestionModel().getId(), CreateTicketViewModelKt.EmailId)) {
                arrayList.add(obj);
            }
        }
        for (QuestionState questionState : arrayList) {
            Object answerForServer = CreateTicketViewModelKt.formatAnswerForServer(questionState);
            if (!i.a(answerForServer, r.f47939a)) {
                list.add(new TicketAttributeRequest(questionState.getQuestionModel().getId(), answerForServer));
            }
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateTicketFormUiState getLastKnownContent() {
        return this._uiState.getValue() instanceof CreateTicketFormUiState.Content ? this._uiState.getValue() : this.lastKnownContentState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFileSizeExceeded(MediaData.Media media) {
        return media.getSize() > this.config.getAttachmentSettings().getUploadSizeLimit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUnsupportedFileType(MediaData.Media media, Set<String> set) {
        return !kotlin.collections.q.J(set, MimeTypeMap.getSingleton().getExtensionFromMimeType(media.getMimeType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r onAnswerUpdated$lambda$3(String questionID, CreateTicketViewModel this$0, CreateTicketFormUiState.Content content) {
        i.e(questionID, "$questionID");
        i.e(this$0, "this$0");
        i.e(content, "content");
        List<TicketAttributeRequest> listReduceAttributeList = ConditionalAttributesReducerKt.reduceAttributeList(questionID, this$0.currentTicketType, content);
        if (!listReduceAttributeList.isEmpty()) {
            this$0.withState(new p011ab.g(3, this$0));
            this$0.fetchTicketType(listReduceAttributeList);
        }
        C2680e.c(Z.a(this$0), this$0.dispatcher, null, new CreateTicketViewModel$onAnswerUpdated$1$2(content, this$0, null), 2);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r onAnswerUpdated$lambda$3$lambda$2$lambda$1(CreateTicketViewModel this$0, CreateTicketFormUiState.Content it) {
        i.e(this$0, "this$0");
        i.e(it, "it");
        this$0._uiState.setValue(CreateTicketFormUiState.Content.copy$default(it, null, null, true, false, 11, null));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r onDeleteFileClicked$lambda$11(AnswerClickData fileClickData, CreateTicketViewModel this$0, CreateTicketFormUiState.Content content) {
        i.e(fileClickData, "$fileClickData");
        i.e(this$0, "this$0");
        i.e(content, "content");
        for (QuestionState questionState : content.getQuestions()) {
            if (i.a(questionState.getQuestionModel().getId(), fileClickData.getQuestionId())) {
                Answer answer = questionState.getAnswer();
                i.c(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                questionState.setAnswer(new Answer.MediaAnswer(kotlin.collections.q.a0(((Answer.MediaAnswer) answer).getMediaItems(), fileClickData.getClickedItem())));
                this$0.onAnswerUpdated(fileClickData.getQuestionId());
                return r.f47939a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r onRetryFileClicked$lambda$9(CreateTicketViewModel this$0, AnswerClickData fileClickData, CreateTicketFormUiState.Content content) {
        i.e(this$0, "this$0");
        i.e(fileClickData, "$fileClickData");
        i.e(content, "content");
        for (QuestionState questionState : content.getQuestions()) {
            if (i.a(questionState.getQuestionModel().getId(), fileClickData.getQuestionId())) {
                Answer answer = questionState.getAnswer();
                i.c(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                for (Answer.MediaAnswer.MediaItem mediaItem : mediaAnswer.getMediaItems()) {
                    if (i.a(mediaItem, fileClickData.getClickedItem())) {
                        mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.None.INSTANCE);
                        questionState.setAnswer(new Answer.MediaAnswer(mediaAnswer.getMediaItems()));
                        this$0.onAnswerUpdated(fileClickData.getQuestionId());
                        return r.f47939a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCtaState() {
        withState(new e(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r updateCtaState$lambda$14(CreateTicketViewModel this$0, CreateTicketFormUiState.Content content) {
        i.e(this$0, "this$0");
        i.e(content, "content");
        List<QuestionState> questions = content.getQuestions();
        ArrayList<QuestionState> arrayList = new ArrayList();
        for (Object obj : questions) {
            if (((QuestionState) obj).getQuestionModel() instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                arrayList.add(obj);
            }
        }
        for (QuestionState questionState : arrayList) {
            questionState.validate();
            if (questionState.getAnswer() instanceof Answer.MediaAnswer) {
                Answer answer = questionState.getAnswer();
                i.c(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                List<Answer.MediaAnswer.MediaItem> mediaItems = ((Answer.MediaAnswer) answer).getMediaItems();
                if (!(mediaItems instanceof Collection) || !mediaItems.isEmpty()) {
                    Iterator<T> it = mediaItems.iterator();
                    while (it.hasNext()) {
                        if (!(((Answer.MediaAnswer.MediaItem) it.next()).getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Success)) {
                            this$0._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, null, null, false, false, 7, null));
                            return r.f47939a;
                        }
                    }
                }
            }
        }
        this$0._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, null, null, false, true, 7, null));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withState(Ia.l<? super CreateTicketFormUiState.Content, r> lVar) {
        if (this._uiState.getValue() instanceof CreateTicketFormUiState.Content) {
            CreateTicketFormUiState value = this._uiState.getValue();
            i.c(value, "null cannot be cast to non-null type io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState.Content");
            lVar.invoke((CreateTicketFormUiState.Content) value);
        }
    }

    public final void createTicket(final kotlinx.coroutines.A a10) {
        MetricTracker metricTracker = this.metricTracker;
        Integer numValueOf = Integer.valueOf(this.ticketTypeId);
        String str = this.conversationId;
        if (str == null) {
            str = "";
        }
        metricTracker.submittedCreateTicketForm(numValueOf, str, this.launchedFrom.getFrom());
        withState(new Ia.l() { // from class: io.intercom.android.sdk.tickets.create.model.b
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.createTicket$lambda$0(this.f39868b, a10, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
    }

    public final u<TicketSideEffect> getEffect() {
        return this.effect;
    }

    public final A<CreateTicketFormUiState> getUiState() {
        return this.uiState;
    }

    public final void onAnswerClicked(AnswerClickData answerClickData) {
        i.e(answerClickData, "answerClickData");
        C2680e.c(Z.a(this), null, null, new C24681(answerClickData, null), 3);
    }

    public final void onAnswerUpdated(final String questionID) {
        i.e(questionID, "questionID");
        withState(new Ia.l(this) { // from class: io.intercom.android.sdk.tickets.create.model.d

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CreateTicketViewModel f39873c;

            {
                this.f39873c = this;
            }

            @Override // Ia.l
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.onAnswerUpdated$lambda$3(questionID, this.f39873c, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
    }

    public final void onDeleteFileClicked(final AnswerClickData fileClickData) {
        i.e(fileClickData, "fileClickData");
        withState(new Ia.l(this) { // from class: io.intercom.android.sdk.tickets.create.model.c

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CreateTicketViewModel f39871c;

            {
                this.f39871c = this;
            }

            @Override // Ia.l
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.onDeleteFileClicked$lambda$11(fileClickData, this.f39871c, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
    }

    public final void onRetryFileClicked(final AnswerClickData fileClickData) {
        i.e(fileClickData, "fileClickData");
        withState(new Ia.l() { // from class: io.intercom.android.sdk.tickets.create.model.a
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.onRetryFileClicked$lambda$9(this.f39866b, fileClickData, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
    }

    public CreateTicketViewModel(CreateTicketLaunchedFrom launchedFrom, TicketRepository ticketRepository, UserIdentity userIdentity, AppConfig config, AbstractC2712w dispatcher, MetricTracker metricTracker, String str, int i10, Context applicationContext) {
        i.e(launchedFrom, "launchedFrom");
        i.e(ticketRepository, "ticketRepository");
        i.e(userIdentity, "userIdentity");
        i.e(config, "config");
        i.e(dispatcher, "dispatcher");
        i.e(metricTracker, "metricTracker");
        i.e(applicationContext, "applicationContext");
        this.launchedFrom = launchedFrom;
        this.ticketRepository = ticketRepository;
        this.userIdentity = userIdentity;
        this.config = config;
        this.dispatcher = dispatcher;
        this.metricTracker = metricTracker;
        this.conversationId = str;
        this.ticketTypeId = i10;
        this.applicationContext = applicationContext;
        StateFlowImpl stateFlowImplA = B.a(CreateTicketFormUiState.Initial.INSTANCE);
        this._uiState = stateFlowImplA;
        this.uiState = C2688e.b(stateFlowImplA);
        v vVarB = w.b(0, 0, null, 7);
        this._effect = vVarB;
        this.effect = C2688e.a(vVarB);
        C2680e.c(Z.a(this), dispatcher, null, new AnonymousClass1(null), 2);
        metricTracker.viewedCreateTicketForm(Integer.valueOf(i10), str == null ? "" : str, launchedFrom.getFrom());
        fetchTicketType$default(this, null, 1, null);
    }
}
