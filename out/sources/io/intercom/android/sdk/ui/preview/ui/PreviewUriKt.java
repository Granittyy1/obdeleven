package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.ViewGroup;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0950j;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.InterfaceC1095k0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.C1141q;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.K;
import coil.compose.AsyncImageKt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: PreviewUri.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewUriKt {

    /* JADX INFO: compiled from: PreviewUri.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PreviewUri.kt */
    @Aa.c(c = "io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1", f = "PreviewUri.kt", l = {251}, m = "invokeSuspend")
    public static final class C24691 extends SuspendLambda implements Ia.p<InterfaceC1095k0<List<? extends Bitmap>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile $file;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: PreviewUri.kt */
        @Aa.c(c = "io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1$1", f = "PreviewUri.kt", l = {}, m = "invokeSuspend")
        public static final class C04521 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super ParcelFileDescriptor>, Object> {
            final /* synthetic */ IntercomPreviewFile $file;
            final /* synthetic */ File $tempFile;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04521(IntercomPreviewFile intercomPreviewFile, File file, kotlin.coroutines.c<? super C04521> cVar) {
                super(2, cVar);
                this.$file = intercomPreviewFile;
                this.$tempFile = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C04521(this.$file, this.$tempFile, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                InputStream inputStream = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(((IntercomPreviewFile.NetworkFile) this.$file).getUrl()).openConnection())).getInputStream();
                if (inputStream == null) {
                    return null;
                }
                File file = this.$tempFile;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i10 = inputStream.read(bArr);
                            if (i10 <= 0) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                p293xa.r rVar = p293xa.r.f47939a;
                                p241t7.b.n(fileOutputStream, null);
                                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                                p241t7.b.n(inputStream, null);
                                return parcelFileDescriptorOpen;
                            }
                            fileOutputStream.write(bArr, 0, i10);
                            try {
                                throw th;
                            } catch (Throwable th) {
                                p241t7.b.n(inputStream, th);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            p241t7.b.n(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super ParcelFileDescriptor> cVar) {
                return ((C04521) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24691(IntercomPreviewFile intercomPreviewFile, Context context, kotlin.coroutines.c<? super C24691> cVar) {
            super(2, cVar);
            this.$file = intercomPreviewFile;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            C24691 c24691 = new C24691(this.$file, this.$context, cVar);
            c24691.L$0 = obj;
            return c24691;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC1095k0<List<Bitmap>> interfaceC1095k0, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((C24691) create(interfaceC1095k0, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0080 A[Catch: all -> 0x00b1, LOOP:0: B:24:0x007e->B:25:0x0080, LOOP_END, TryCatch #0 {all -> 0x00b1, blocks: (B:23:0x0074, B:25:0x0080, B:28:0x00b5), top: B:36:0x0074 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC1095k0 interfaceC1095k0;
            List list;
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
            PdfRenderer pdfRenderer;
            int pageCount;
            int i10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = this.label;
            ParcelFileDescriptor parcelFileDescriptor = null;
            try {
                if (i11 == 0) {
                    kotlin.b.b(obj);
                    interfaceC1095k0 = (InterfaceC1095k0) this.L$0;
                    ArrayList arrayList = new ArrayList();
                    if (this.$file instanceof IntercomPreviewFile.NetworkFile) {
                        File fileCreateTempFile = File.createTempFile("download_", ".tmp", this.$context.getCacheDir());
                        Sa.a aVar = N.f43200c;
                        C04521 c04521 = new C04521(this.$file, fileCreateTempFile, null);
                        this.L$0 = interfaceC1095k0;
                        this.L$1 = arrayList;
                        this.label = 1;
                        Object objF = C2680e.f(aVar, c04521, this);
                        if (objF == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        list = arrayList;
                        obj = objF;
                    } else {
                        list = arrayList;
                        parcelFileDescriptorOpenFileDescriptor = this.$context.getContentResolver().openFileDescriptor(this.$file.getUri(), "r");
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                            pageCount = pdfRenderer.getPageCount();
                            for (i10 = 0; i10 < pageCount; i10++) {
                                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i10);
                                kotlin.jvm.internal.i.d(pageOpenPage, "openPage(...)");
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pageOpenPage.getWidth(), pageOpenPage.getHeight(), Bitmap.Config.ARGB_8888);
                                kotlin.jvm.internal.i.d(bitmapCreateBitmap, "createBitmap(...)");
                                new Canvas(bitmapCreateBitmap).drawColor(-1);
                                pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                                list.add(bitmapCreateBitmap);
                                pageOpenPage.close();
                            }
                        } catch (Throwable th) {
                            parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                            th = th;
                            if (parcelFileDescriptor != null) {
                                parcelFileDescriptor.close();
                            }
                            throw th;
                        }
                    }
                    interfaceC1095k0.setValue(list);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return p293xa.r.f47939a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$1;
                interfaceC1095k0 = (InterfaceC1095k0) this.L$0;
                kotlin.b.b(obj);
                parcelFileDescriptorOpenFileDescriptor = (ParcelFileDescriptor) obj;
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                    pageCount = pdfRenderer.getPageCount();
                    while (i10 < pageCount) {
                        PdfRenderer.Page pageOpenPage2 = pdfRenderer.openPage(i10);
                        kotlin.jvm.internal.i.d(pageOpenPage2, "openPage(...)");
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(pageOpenPage2.getWidth(), pageOpenPage2.getHeight(), Bitmap.Config.ARGB_8888);
                        kotlin.jvm.internal.i.d(bitmapCreateBitmap2, "createBitmap(...)");
                        new Canvas(bitmapCreateBitmap2).drawColor(-1);
                        pageOpenPage2.render(bitmapCreateBitmap2, null, null, 1);
                        list.add(bitmapCreateBitmap2);
                        pageOpenPage2.close();
                    }
                }
                interfaceC1095k0.setValue(list);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return p293xa.r.f47939a;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC1095k0<List<? extends Bitmap>> interfaceC1095k0, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return invoke2((InterfaceC1095k0<List<Bitmap>>) interfaceC1095k0, cVar);
        }
    }

    private static final void DocumentPreview(final androidx.compose.ui.h hVar, final Uri uri, final boolean z10, final InterfaceC1161g interfaceC1161g, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        C1086g c1086gP = interfaceC1084f.p(1870066421);
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        if ((i11 & 8) != 0) {
            interfaceC1161g = InterfaceC1161g.a.f14244b;
        }
        final Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        BoxWithConstraintsKt.a(hVar.i(W.f10226c), null, false, androidx.compose.runtime.internal.a.b(1599096779, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt.DocumentPreview.1
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) throws IOException {
                invoke(interfaceC0950j, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f2, int i12) throws IOException {
                int i13;
                kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i12 & 14) == 0) {
                    i13 = i12 | (interfaceC1084f2.K(BoxWithConstraints) ? 4 : 2);
                } else {
                    i13 = i12;
                }
                if ((i13 & 91) == 18 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                float fD = BoxWithConstraints.d();
                Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
                String string = "";
                if (cursorQuery != null) {
                    try {
                        cursorQuery.moveToFirst();
                        string = cursorQuery.getColumnIndex("_display_name") != -1 ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name")) : "";
                        p293xa.r rVar = p293xa.r.f47939a;
                        p241t7.b.n(cursorQuery, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            p241t7.b.n(cursorQuery, th);
                            throw th2;
                        }
                    }
                }
                String str = string;
                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarN = W.n(fD, 1.414f * fD, aVar);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                androidx.compose.ui.h hVarF = BoxWithConstraints.f(C0932d.b(hVarN, intercomTheme.getColors(interfaceC1084f2, 6).m621getBackground0d7_KjU(), h0.f13629a), androidx.compose.ui.d.a.f13339e);
                androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13347n;
                C0945e.c cVar = C0945e.f10288e;
                InterfaceC1161g interfaceC1161g2 = interfaceC1161g;
                boolean z11 = z10;
                C0953m c0953mA = C0952l.a(cVar, aVar2, interfaceC1084f2, 54);
                int iF = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarF);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f2.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f2.r();
                if (interfaceC1084f2.m()) {
                    interfaceC1084f2.v(aVar3);
                } else {
                    interfaceC1084f2.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, c0953mA);
                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                ImageKt.a(U.c.a(R.drawable.intercom_ic_document, interfaceC1084f2, 0), "Doc Icon", W.m(aVar, Float.compare(fD, (float) 48) > 0 ? 56 : 24), null, interfaceC1161g2, 0.0f, new androidx.compose.ui.graphics.A(5, intercomTheme.getColors(interfaceC1084f2, 6).m615getAction0d7_KjU()), interfaceC1084f2, 56, 40);
                interfaceC1084f2.L(-547888989);
                if (z11) {
                    Lb.a.a(interfaceC1084f2, W.e(aVar, 16));
                    TextKt.b(str, null, intercomTheme.getColors(interfaceC1084f2, 6).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f2, 6).getType04Point5(), interfaceC1084f2, 0, 0, 65530);
                }
                interfaceC1084f2.D();
                interfaceC1084f2.J();
            }
        }, c1086gP), c1086gP, 3072, 6);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final boolean z11 = z10;
            final InterfaceC1161g interfaceC1161g2 = interfaceC1161g;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewUriKt.DocumentPreview$lambda$11(hVar, uri, z11, interfaceC1161g2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r DocumentPreview$lambda$11(androidx.compose.ui.h modifier, Uri uri, boolean z10, InterfaceC1161g interfaceC1161g, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(modifier, "$modifier");
        kotlin.jvm.internal.i.e(uri, "$uri");
        DocumentPreview(modifier, uri, z10, interfaceC1161g, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void PdfPreview(androidx.compose.ui.h hVar, IntercomPreviewFile intercomPreviewFile, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        C1086g c1086gP = interfaceC1084f.p(25606530);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        androidx.compose.ui.h hVar3 = hVar2;
        LazyDslKt.a(hVar2.i(W.f10226c), null, null, false, null, null, null, false, null, new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.d(1, loadFilesAsBitmaps(intercomPreviewFile, c1086gP, 8).getValue()), c1086gP, 0, 510);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.row.p(hVar3, intercomPreviewFile, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PdfPreview$lambda$13(final List bitmaps, androidx.compose.foundation.lazy.p LazyColumn) {
        kotlin.jvm.internal.i.e(bitmaps, "$bitmaps");
        kotlin.jvm.internal.i.e(LazyColumn, "$this$LazyColumn");
        final PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$1 previewUriKt$PdfPreview$lambda$13$$inlined$items$default$1 = new Ia.l() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$1
            @Override // Ia.l
            public final Void invoke(Bitmap bitmap) {
                return null;
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Bitmap) obj);
            }
        };
        LazyColumn.g(bitmaps.size(), null, new Ia.l<Integer, Object>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                return previewUriKt$PdfPreview$lambda$13$$inlined$items$default$1.invoke(bitmaps.get(i10));
            }
        }, new ComposableLambdaImpl(true, -632812321, new Ia.r<androidx.compose.foundation.lazy.b, Integer, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // Ia.r
            public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, Integer num, InterfaceC1084f interfaceC1084f, Integer num2) {
                invoke(bVar, num.intValue(), interfaceC1084f, num2.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(androidx.compose.foundation.lazy.b bVar, int i10, InterfaceC1084f interfaceC1084f, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (interfaceC1084f.K(bVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= interfaceC1084f.h(i10) ? 32 : 16;
                }
                if (!interfaceC1084f.C(i12 & 1, (i12 & 147) != 146)) {
                    interfaceC1084f.w();
                    return;
                }
                Bitmap bitmap = (Bitmap) bitmaps.get(i10);
                interfaceC1084f.L(-1436658847);
                androidx.compose.ui.h hVarJ = PaddingKt.j(W.f10226c, 0.0f, 0.0f, 0.0f, 8, 7);
                C1141q c1141q = new C1141q(bitmap);
                InterfaceC1161g.a.c cVar = InterfaceC1161g.a.f14246d;
                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                boolean zK = interfaceC1084f.K(c1141q);
                Object objF = interfaceC1084f.f();
                if (zK || objF == InterfaceC1084f.a.f12980a) {
                    objF = C6.b.a(c1141q, 1);
                    interfaceC1084f.E(objF);
                }
                ImageKt.a((androidx.compose.ui.graphics.painter.a) objF, "Pdf Preview", hVarJ, fVar, cVar, 1.0f, null, interfaceC1084f, 25008, 0);
                interfaceC1084f.D();
            }
        }));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PdfPreview$lambda$14(androidx.compose.ui.h hVar, IntercomPreviewFile file, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(file, "$file");
        PdfPreview(hVar, file, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void PreviewUri(androidx.compose.ui.h hVar, IntercomPreviewFile file, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(file, "file");
        C1086g c1086gP = interfaceC1084f.p(1385802164);
        if ((i11 & 1) != 0) {
            hVar = androidx.compose.ui.h.a.f13984b;
        }
        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        Uri uri = file.getUri();
        String mimeType = file.getMimeType(context);
        if (ContentTypeExtensionKt.isImage(mimeType)) {
            c1086gP.L(1931959814);
            ThumbnailPreview(hVar, null, file, c1086gP, (i10 & 14) | 512, 2);
            c1086gP.T(false);
        } else if (ContentTypeExtensionKt.isVideo(mimeType) || ContentTypeExtensionKt.isAudio(mimeType)) {
            c1086gP.L(1932086573);
            VideoPlayer(hVar, uri, c1086gP, (i10 & 14) | 64, 0);
            c1086gP.T(false);
        } else if (ContentTypeExtensionKt.isPdf(mimeType)) {
            c1086gP.L(1932182828);
            PdfPreview(hVar, file, c1086gP, (i10 & 14) | 64, 0);
            c1086gP.T(false);
        } else {
            c1086gP.L(1932268233);
            DocumentPreview(hVar, uri, false, null, c1086gP, (i10 & 14) | 64, 12);
            c1086gP.T(false);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.tickets.m(hVar, file, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewUri$lambda$0(androidx.compose.ui.h hVar, IntercomPreviewFile file, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(file, "$file");
        PreviewUri(hVar, file, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void ThumbnailPreview(androidx.compose.ui.h hVar, InterfaceC1161g interfaceC1161g, final IntercomPreviewFile file, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(file, "file");
        C1086g c1086gP = interfaceC1084f.p(1221057551);
        final androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        final InterfaceC1161g interfaceC1161g2 = (i11 & 2) != 0 ? InterfaceC1161g.a.f14244b : interfaceC1161g;
        O0 o10 = AndroidCompositionLocals_androidKt.f14793b;
        Context context = (Context) c1086gP.x(o10);
        String mimeType = file.getMimeType(context);
        if (ContentTypeExtensionKt.isImage(mimeType) || ContentTypeExtensionKt.isVideo(mimeType) || ContentTypeExtensionKt.isPdf(mimeType)) {
            c1086gP.L(-1993113608);
            androidx.compose.ui.h hVarI = hVar2.i(W.f10226c);
            coil.f imageLoader = IntercomImageLoaderKt.getImageLoader(context);
            coil.request.g.a aVar = new coil.request.g.a((Context) c1086gP.x(o10));
            aVar.f23074c = file.getUri();
            aVar.b();
            AsyncImageKt.b(aVar.a(), "Image", imageLoader, hVarI, null, interfaceC1161g2, null, c1086gP, ((i10 << 18) & 29360128) | 568, 8048);
            c1086gP.T(false);
        } else {
            c1086gP.L(-1992720435);
            DocumentPreview(hVar2, file.getUri(), false, interfaceC1161g2, c1086gP, (i10 & 14) | 448 | ((i10 << 6) & 7168), 0);
            c1086gP.T(false);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.preview.ui.u
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewUriKt.ThumbnailPreview$lambda$2(hVar2, interfaceC1161g2, file, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ThumbnailPreview$lambda$2(androidx.compose.ui.h hVar, InterfaceC1161g interfaceC1161g, IntercomPreviewFile file, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(file, "$file");
        ThumbnailPreview(hVar, interfaceC1161g, file, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void VideoPlayer(androidx.compose.ui.h hVar, final Uri uri, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        C1086g c1086gP = interfaceC1084f.p(-1579699387);
        final androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        final X xI = J0.i(c1086gP.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), c1086gP);
        int i12 = p078g1.p.f35354g;
        g1.p.b.a aVar = new g1.p.b.a();
        ImmutableMap.h();
        ImmutableList.K();
        List listEmptyList = Collections.emptyList();
        ImmutableList immutableListK = ImmutableList.K();
        g1.p.e.a aVar2 = new g1.p.e.a();
        g1.p.a aVarA = new p078g1.p("", new g1.p.c(aVar), uri != null ? new g1.p.f(uri, null, null, listEmptyList, immutableListK, null, -9223372036854775807L) : null, new g1.p.e(aVar2), p078g1.r.f35393B, g1.p.g.f35390a).a();
        String strValueOf = String.valueOf(uri.hashCode());
        strValueOf.getClass();
        aVarA.f35361a = strValueOf;
        aVarA.f35368h = uri;
        p078g1.p pVarA = aVarA.a();
        final K kA = new ExoPlayer.b(context).a();
        kA.h0(ImmutableList.M(pVarA));
        kA.b();
        AndroidView_androidKt.b(new io.intercom.android.sdk.survey.ui.components.a(1, kA), hVar2, null, c1086gP, (i10 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 4);
        E.a("", new Ia.l() { // from class: io.intercom.android.sdk.ui.preview.ui.w
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return PreviewUriKt.VideoPlayer$lambda$9(kA, xI, (B) obj);
            }
        }, c1086gP);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewUriKt.VideoPlayer$lambda$10(hVar2, uri, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r VideoPlayer$lambda$10(androidx.compose.ui.h hVar, Uri uri, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(uri, "$uri");
        VideoPlayer(hVar, uri, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.media3.ui.d VideoPlayer$lambda$6(ExoPlayer exoPlayer, Context it) {
        kotlin.jvm.internal.i.e(exoPlayer, "$exoPlayer");
        kotlin.jvm.internal.i.e(it, "it");
        androidx.media3.ui.d dVar = new androidx.media3.ui.d(it);
        dVar.setPlayer(exoPlayer);
        dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.A VideoPlayer$lambda$9(final ExoPlayer exoPlayer, N0 lifecycleOwner, B DisposableEffect) {
        kotlin.jvm.internal.i.e(exoPlayer, "$exoPlayer");
        kotlin.jvm.internal.i.e(lifecycleOwner, "$lifecycleOwner");
        kotlin.jvm.internal.i.e(DisposableEffect, "$this$DisposableEffect");
        exoPlayer.I();
        final androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: io.intercom.android.sdk.ui.preview.ui.v
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                PreviewUriKt.VideoPlayer$lambda$9$lambda$7(exoPlayer, interfaceC1376t, event);
            }
        };
        final Lifecycle lifecycle = ((InterfaceC1376t) lifecycleOwner.getValue()).getLifecycle();
        lifecycle.a(rVar);
        return new androidx.compose.runtime.A() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$VideoPlayer$lambda$9$$inlined$onDispose$1
            @Override // androidx.compose.runtime.A
            public void dispose() {
                lifecycle.c(rVar);
                exoPlayer.a();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VideoPlayer$lambda$9$lambda$7(ExoPlayer exoPlayer, InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        kotlin.jvm.internal.i.e(exoPlayer, "$exoPlayer");
        kotlin.jvm.internal.i.e(interfaceC1376t, "<unused var>");
        kotlin.jvm.internal.i.e(event, "event");
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            exoPlayer.c();
        }
    }

    private static final N0<List<Bitmap>> loadFilesAsBitmaps(IntercomPreviewFile intercomPreviewFile, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-964565197);
        X xH = J0.h(EmptyList.f42983b, intercomPreviewFile, new C24691(intercomPreviewFile, (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b), null), interfaceC1084f);
        interfaceC1084f.D();
        return xH;
    }
}
