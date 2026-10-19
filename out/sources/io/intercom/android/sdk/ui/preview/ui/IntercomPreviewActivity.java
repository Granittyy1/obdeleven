package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.core.view.D;
import androidx.core.view.v0;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: IntercomPreviewActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomPreviewActivity extends ComponentActivity {
    private final p293xa.g viewModel$delegate = kotlin.a.a(new c(this, 0));
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: IntercomPreviewActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final Intent createIntent(Context context, IntercomPreviewArgs args) {
            kotlin.jvm.internal.i.e(context, "context");
            kotlin.jvm.internal.i.e(args, "args");
            Intent intent = new Intent(context, (Class<?>) IntercomPreviewActivity.class);
            intent.putExtra("INTERCOM_PREVIEW_ARGS", args);
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(int i10, List<? extends Uri> list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("MEDIA_RESULT_URIS", new ArrayList<>(list));
        setResult(i10, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntercomPreviewArgs getPreviewData() {
        IntercomPreviewArgs intercomPreviewArgs;
        Bundle extras = getIntent().getExtras();
        return (extras == null || (intercomPreviewArgs = (IntercomPreviewArgs) p271w0.b.a(extras, "INTERCOM_PREVIEW_ARGS", IntercomPreviewArgs.class)) == null) ? new IntercomPreviewArgs(null, null, null, false, null, 31, null) : intercomPreviewArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PreviewViewModel getViewModel() {
        return (PreviewViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreviewViewModel viewModel_delegate$lambda$0(IntercomPreviewActivity this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        return PreviewViewModel.Companion.create$intercom_sdk_ui_release(this$0, this$0.getPreviewData());
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        v0.e cVar;
        super.onCreate(bundle);
        androidx.activity.r.b(this);
        Window window = getWindow();
        D d10 = new D(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            v0.d dVar = new v0.d(window.getInsetsController(), d10);
            dVar.f16996b = window;
            cVar = dVar;
        } else {
            cVar = new v0.c(window, d10);
        }
        cVar.c(false);
        androidx.activity.compose.d.a(this, new ComposableLambdaImpl(true, -2110849940, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity.onCreate.1

            /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: IntercomPreviewActivity.kt */
            public static final class C04511 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
                final /* synthetic */ IntercomPreviewActivity this$0;

                public C04511(IntercomPreviewActivity intercomPreviewActivity) {
                    this.this$0 = intercomPreviewActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final p293xa.r invoke$lambda$0(IntercomPreviewActivity this$0) {
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.finishWithResult(0, EmptyList.f42983b);
                    return p293xa.r.f47939a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final p293xa.r invoke$lambda$1(IntercomPreviewActivity this$0, IntercomPreviewFile it) {
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    kotlin.jvm.internal.i.e(it, "it");
                    this$0.getViewModel().onDeleteClicked$intercom_sdk_ui_release(it);
                    return p293xa.r.f47939a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final p293xa.r invoke$lambda$2(IntercomPreviewActivity this$0, List it) {
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    kotlin.jvm.internal.i.e(it, "it");
                    this$0.finishWithResult(-1, it);
                    return p293xa.r.f47939a;
                }

                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                    invoke(interfaceC1084f, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                    if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                        interfaceC1084f.w();
                        return;
                    }
                    IntercomPreviewArgs previewData = this.this$0.getPreviewData();
                    PreviewViewModel viewModel = this.this$0.getViewModel();
                    final IntercomPreviewActivity intercomPreviewActivity = this.this$0;
                    PreviewRootScreenKt.PreviewRootScreen(null, previewData, viewModel, new Ia.a() { // from class: io.intercom.android.sdk.ui.preview.ui.d
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomPreviewActivity.AnonymousClass1.C04511.invoke$lambda$0(intercomPreviewActivity);
                        }
                    }, new Ia.l() { // from class: io.intercom.android.sdk.ui.preview.ui.e
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return IntercomPreviewActivity.AnonymousClass1.C04511.invoke$lambda$1(intercomPreviewActivity, (IntercomPreviewFile) obj);
                        }
                    }, new Ia.l() { // from class: io.intercom.android.sdk.ui.preview.ui.f
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return IntercomPreviewActivity.AnonymousClass1.C04511.invoke$lambda$2(intercomPreviewActivity, (List) obj);
                        }
                    }, interfaceC1084f, 576, 1);
                }
            }

            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return p293xa.r.f47939a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                    return;
                }
                if (((PreviewUiState) J0.a(IntercomPreviewActivity.this.getViewModel().getState$intercom_sdk_ui_release(), interfaceC1084f, 8).getValue()).getFiles().isEmpty()) {
                    IntercomPreviewActivity.this.finishWithResult(0, EmptyList.f42983b);
                }
                IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(1935728022, new C04511(IntercomPreviewActivity.this), interfaceC1084f), interfaceC1084f, 3072, 7);
            }
        }));
    }
}
