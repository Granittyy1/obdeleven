package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FallbackPollingUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FallbackPollingUseCase {
    public static final int $stable = 8;
    private final Ia.a<AppConfig> appConfig;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: FallbackPollingUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase", f = "FallbackPollingUseCase.kt", l = {R.styleable.AppCompatTheme_actionOverflowButtonStyle, R.styleable.AppCompatTheme_alertDialogTheme}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FallbackPollingUseCase.this.invoke(null, this);
        }
    }

    public FallbackPollingUseCase(Ia.a<AppConfig> appConfig, TimeProvider timeProvider, RefreshConversationUseCase refreshConversationUseCase) {
        i.e(appConfig, "appConfig");
        i.e(timeProvider, "timeProvider");
        i.e(refreshConversationUseCase, "refreshConversationUseCase");
        this.appConfig = appConfig;
        this.timeProvider = timeProvider;
        this.refreshConversationUseCase = refreshConversationUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getDataLayer().getConfig().getValue();
    }

    public final Ia.a<AppConfig> getAppConfig() {
        return this.appConfig;
    }

    public final RefreshConversationUseCase getRefreshConversationUseCase() {
        return this.refreshConversationUseCase;
    }

    public final TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:24:0x0078->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e0 -> B:17:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invoke(kotlinx.coroutines.flow.q<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r13, kotlin.coroutines.c<? super p293xa.r> r14) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase.invoke(kotlinx.coroutines.flow.q, kotlin.coroutines.c):java.lang.Object");
    }

    public /* synthetic */ FallbackPollingUseCase(Ia.a aVar, TimeProvider timeProvider, RefreshConversationUseCase refreshConversationUseCase, int i10, e eVar) {
        this((i10 & 1) != 0 ? new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.a(1) : aVar, (i10 & 2) != 0 ? Injector.get().getTimeProvider() : timeProvider, refreshConversationUseCase);
    }
}
