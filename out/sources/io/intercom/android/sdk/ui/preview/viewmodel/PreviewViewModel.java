package io.intercom.android.sdk.ui.preview.viewmodel;

import Ia.p;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.text.n;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.A;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.q;
import p014b1.a;
import p014b1.f;
import p293xa.r;

/* JADX INFO: compiled from: PreviewViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewViewModel extends Y {
    private final q<PreviewUiState> _state;
    private InterfaceC2694i0 downloadJob;
    private final IntercomPreviewArgs previewArgs;
    private final A<PreviewUiState> state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: PreviewViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final PreviewViewModel create$intercom_sdk_ui_release(c0 owner, IntercomPreviewArgs previewArgs) {
            i.e(owner, "owner");
            i.e(previewArgs, "previewArgs");
            a0.c factory = factory$intercom_sdk_ui_release(previewArgs);
            i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : a.C0207a.f20498b;
            i.e(store, "store");
            i.e(defaultCreationExtras, "defaultCreationExtras");
            f fVar = new f(store, factory, defaultCreationExtras);
            c cVarA = l.a(PreviewViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (PreviewViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        public final a0.c factory$intercom_sdk_ui_release(final IntercomPreviewArgs previewArgs) {
            i.e(previewArgs, "previewArgs");
            return new a0.c() { // from class: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$Companion$factory$1
                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Oa.c cVar, a aVar) {
                    return super.create(cVar, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Class cls, a aVar) {
                    return super.create(cls, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public <T extends Y> T create(Class<T> modelClass) {
                    i.e(modelClass, "modelClass");
                    return new PreviewViewModel(previewArgs);
                }
            };
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveDocument$1, reason: invalid class name */
    /* JADX INFO: compiled from: PreviewViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveDocument$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IntercomPreviewFile.NetworkFile networkFile, Context context, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$file = networkFile;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return PreviewViewModel.this.new AnonymousClass1(this.$file, this.$context, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            if (Build.VERSION.SDK_INT >= 29) {
                PreviewViewModel.this.saveFileOnApi29Above(this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            } else {
                PreviewViewModel previewViewModel = PreviewViewModel.this;
                String url = this.$file.getUrl();
                String mimeType = this.$file.getMimeType();
                Context context = this.$context;
                String DIRECTORY_DOWNLOADS = Environment.DIRECTORY_DOWNLOADS;
                i.d(DIRECTORY_DOWNLOADS, "DIRECTORY_DOWNLOADS");
                previewViewModel.saveFileLegacy(url, mimeType, context, DIRECTORY_DOWNLOADS);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveImage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PreviewViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveImage$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C24701 extends SuspendLambda implements p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24701(IntercomPreviewFile.NetworkFile networkFile, Context context, kotlin.coroutines.c<? super C24701> cVar) {
            super(2, cVar);
            this.$file = networkFile;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return PreviewViewModel.this.new C24701(this.$file, this.$context, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            Bitmap bitmapPrepareBitmap = PreviewViewModel.this.prepareBitmap(this.$file.getUrl());
            if (bitmapPrepareBitmap == null) {
                PreviewViewModel.this.showFileSaveFailed(this.$context);
                return r.f47939a;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                PreviewViewModel.this.saveImageOnApi29Above(bitmapPrepareBitmap, this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            } else {
                PreviewViewModel.this.saveImageLegacy(bitmapPrepareBitmap, this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24701) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveVideo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PreviewViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveVideo$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C24711 extends SuspendLambda implements p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24711(IntercomPreviewFile.NetworkFile networkFile, Context context, kotlin.coroutines.c<? super C24711> cVar) {
            super(2, cVar);
            this.$file = networkFile;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return PreviewViewModel.this.new C24711(this.$file, this.$context, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            if (Build.VERSION.SDK_INT >= 29) {
                PreviewViewModel.this.saveVideoOnApi29Above(this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            } else {
                PreviewViewModel previewViewModel = PreviewViewModel.this;
                String url = this.$file.getUrl();
                String mimeType = this.$file.getMimeType();
                Context context = this.$context;
                String DIRECTORY_DOWNLOADS = Environment.DIRECTORY_DOWNLOADS;
                i.d(DIRECTORY_DOWNLOADS, "DIRECTORY_DOWNLOADS");
                previewViewModel.saveFileLegacy(url, mimeType, context, DIRECTORY_DOWNLOADS);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24711) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$showFileSaveFailed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PreviewViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$showFileSaveFailed$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C24721 extends SuspendLambda implements p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ PreviewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24721(Context context, PreviewViewModel previewViewModel, kotlin.coroutines.c<? super C24721> cVar) {
            super(2, cVar);
            this.$context = context;
            this.this$0 = previewViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new C24721(this.$context, this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            Toast.makeText(this.$context, ((PreviewUiState) this.this$0._state.getValue()).getSaveFailedText(), 0).show();
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24721) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$showFileSaveSuccess$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PreviewViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$showFileSaveSuccess$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C24731 extends SuspendLambda implements p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ PreviewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24731(Context context, PreviewViewModel previewViewModel, kotlin.coroutines.c<? super C24731> cVar) {
            super(2, cVar);
            this.$context = context;
            this.this$0 = previewViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new C24731(this.$context, this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            Toast.makeText(this.$context, ((PreviewUiState) this.this$0._state.getValue()).getFileSavedText(), 0).show();
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24731) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public PreviewViewModel(IntercomPreviewArgs previewArgs) {
        i.e(previewArgs, "previewArgs");
        this.previewArgs = previewArgs;
        StateFlowImpl stateFlowImplA = B.a(new PreviewUiState(null, 0, false, false, null, false, null, null, null, 511, null));
        this._state = stateFlowImplA;
        this.state = stateFlowImplA;
        stateFlowImplA.k(null, new PreviewUiState(previewArgs.getUris(), 0, showDeleteAction(previewArgs.getUris().size()), previewArgs.getShowSendCTA(), previewArgs.getCtaText(), previewArgs.getDownloadState().getShowDownloadAction(), previewArgs.getDownloadState().getFileSavingText(), previewArgs.getDownloadState().getFileSavedText(), previewArgs.getDownloadState().getSaveFailedText(), 2, null));
    }

    private final String getNonExistingFileNameFromUrl(String str, Uri uri, String str2, Context context) throws IOException {
        String strGuessFileName = URLUtil.guessFileName(str, null, str2);
        i.b(strGuessFileName);
        List listE0 = n.e0(strGuessFileName, new String[]{"."}, 2, 2);
        int i10 = 0;
        String str3 = (String) kotlin.collections.q.Q(0, listE0);
        if (str3 == null) {
            str3 = "fileName";
        }
        Pair pair = new Pair(str3, kotlin.collections.q.Q(1, listE0));
        String str4 = (String) pair.a();
        String str5 = (String) pair.b();
        String[] strArr = {str4 + '%', B7.b.c("%.", str5)};
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, "_display_name LIKE ? AND _display_name LIKE ?", strArr, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_display_name");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    i.d(string, "getString(...)");
                    arrayList.add(string);
                }
                r rVar = r.f47939a;
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
        while (true) {
            i10++;
            if (!arrayList.contains(strGuessFileName)) {
                return strGuessFileName;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4 + " (" + i10 + ')');
            if (str5 != null) {
                sb2.append(".".concat(str5));
            }
            strGuessFileName = sb2.toString();
            i.d(strGuessFileName, "toString(...)");
        }
    }

    private final String getNonExistingFileNameFromUrlLegacy(String str, File file, String str2) {
        String strGuessFileName = URLUtil.guessFileName(str, null, str2);
        i.b(strGuessFileName);
        List listE0 = n.e0(strGuessFileName, new String[]{"."}, 2, 2);
        int i10 = 0;
        String str3 = (String) kotlin.collections.q.Q(0, listE0);
        if (str3 == null) {
            str3 = "fileName";
        }
        Pair pair = new Pair(str3, kotlin.collections.q.Q(1, listE0));
        String str4 = (String) pair.a();
        String str5 = (String) pair.b();
        while (true) {
            i10++;
            if (!new File(file, strGuessFileName).exists()) {
                return strGuessFileName;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4 + " (" + i10 + ')');
            if (str5 != null) {
                sb2.append(".".concat(str5));
            }
            strGuessFileName = sb2.toString();
            i.d(strGuessFileName, "toString(...)");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap prepareBitmap(String str) {
        int i10;
        try {
            int iC = new U0.a(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream()).c(1, "Orientation");
            if (iC == 3) {
                i10 = 180;
            } else if (iC != 6) {
                i10 = iC != 8 ? 0 : 270;
            } else {
                i10 = 90;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream());
            i.b(bitmapDecodeStream);
            return rotate(bitmapDecodeStream, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private final Bitmap rotate(Bitmap bitmap, float f10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        i.d(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    private final void saveDocument(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        this.downloadJob = C2680e.c(Z.a(this), N.f43200c, null, new AnonymousClass1(networkFile, context, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFileLegacy(String str, String str2, Context context, String str3) throws IOException {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str3);
        externalStoragePublicDirectory.mkdir();
        saveFileToStream(str, new FileOutputStream(new File(externalStoragePublicDirectory, getNonExistingFileNameFromUrlLegacy(str, externalStoragePublicDirectory, str2))));
        showFileSaveSuccess(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFileOnApi29Above(String str, String str2, Context context) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            i.d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, EXTERNAL_CONTENT_URI, str2, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = context.getContentResolver();
            Uri uriInsert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
            if (uriInsert == null || (parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriInsert, "w")) == null) {
                return;
            }
            saveFileToStream(str, new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()));
            parcelFileDescriptorOpenFileDescriptor.close();
            contentValues.clear();
            contentResolver.update(uriInsert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e10) {
            e10.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final void saveFileToStream(String str, OutputStream outputStream) throws IOException {
        InputStream inputStream = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                } else {
                    outputStream.write(bArr, 0, i10);
                }
            }
            inputStream.close();
        }
        outputStream.close();
    }

    private final void saveImage(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        this.downloadJob = C2680e.c(Z.a(this), N.f43200c, null, new C24701(networkFile, context, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveImageLegacy(Bitmap bitmap, String str, String str2, Context context) throws IOException {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        externalStoragePublicDirectory.mkdir();
        saveImageToStream(bitmap, new FileOutputStream(new File(externalStoragePublicDirectory, getNonExistingFileNameFromUrlLegacy(str, externalStoragePublicDirectory, str2))));
        showFileSaveSuccess(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveImageOnApi29Above(Bitmap bitmap, String str, String str2, Context context) {
        OutputStream outputStreamOpenOutputStream;
        try {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            i.d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, EXTERNAL_CONTENT_URI, str2, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("is_pending", (Integer) 1);
            Uri uriInsert = context.getContentResolver().insert(EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null || (outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert)) == null) {
                return;
            }
            saveImageToStream(bitmap, outputStreamOpenOutputStream);
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            context.getContentResolver().update(uriInsert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e10) {
            e10.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final void saveImageToStream(Bitmap bitmap, OutputStream outputStream) throws IOException {
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        outputStream.close();
    }

    private final void saveVideo(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        this.downloadJob = C2680e.c(Z.a(this), N.f43200c, null, new C24711(networkFile, context, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveVideoOnApi29Above(String str, String str2, Context context) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            i.d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, EXTERNAL_CONTENT_URI, str2, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
            contentValues.put("is_pending", (Integer) 1);
            ContentResolver contentResolver = context.getContentResolver();
            Uri uriInsert = contentResolver.insert(EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null || (parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriInsert, "w")) == null) {
                return;
            }
            saveFileToStream(str, new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()));
            parcelFileDescriptorOpenFileDescriptor.close();
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            contentResolver.update(uriInsert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e10) {
            e10.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final boolean showDeleteAction(int i10) {
        DeleteType deleteType = this.previewArgs.getDeleteType();
        if (i.a(deleteType, DeleteType.None.INSTANCE)) {
            return false;
        }
        if (!i.a(deleteType, DeleteType.Delete.INSTANCE)) {
            if (!i.a(deleteType, DeleteType.Remove.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            if (i10 <= 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFileSaveFailed(Context context) {
        p040d1.a aVarA = Z.a(this);
        Sa.b bVar = N.f43198a;
        C2680e.c(aVarA, kotlinx.coroutines.internal.q.f43500a, null, new C24721(context, this, null), 2);
    }

    private final void showFileSaveSuccess(Context context) {
        p040d1.a aVarA = Z.a(this);
        Sa.b bVar = N.f43198a;
        C2680e.c(aVarA, kotlinx.coroutines.internal.q.f43500a, null, new C24731(context, this, null), 2);
    }

    public final A<PreviewUiState> getState$intercom_sdk_ui_release() {
        return this.state;
    }

    public final void onDeleteClicked$intercom_sdk_ui_release(IntercomPreviewFile file) {
        PreviewUiState value;
        PreviewUiState previewUiState;
        ArrayList arrayListA0;
        i.e(file, "file");
        q<PreviewUiState> qVar = this._state;
        do {
            value = qVar.getValue();
            previewUiState = value;
            arrayListA0 = kotlin.collections.q.a0(previewUiState.getFiles(), file);
        } while (!qVar.d(value, previewUiState.copy((506 & 1) != 0 ? previewUiState.files : arrayListA0, (506 & 2) != 0 ? previewUiState.currentPage : 0, (506 & 4) != 0 ? previewUiState.showDeleteAction : showDeleteAction(arrayListA0.size()), (506 & 8) != 0 ? previewUiState.showSendAction : false, (506 & 16) != 0 ? previewUiState.confirmationText : null, (506 & 32) != 0 ? previewUiState.showDownloadAction : false, (506 & 64) != 0 ? previewUiState.fileSavingText : null, (506 & 128) != 0 ? previewUiState.fileSavedText : null, (506 & 256) != 0 ? previewUiState.saveFailedText : null)));
    }

    public final void onPageNavigated$intercom_sdk_ui_release(int i10) {
        PreviewUiState value;
        PreviewUiState previewUiState;
        q<PreviewUiState> qVar = this._state;
        do {
            value = qVar.getValue();
            previewUiState = value;
        } while (!qVar.d(value, previewUiState.copy((506 & 1) != 0 ? previewUiState.files : null, (506 & 2) != 0 ? previewUiState.currentPage : i10, (506 & 4) != 0 ? previewUiState.showDeleteAction : false, (506 & 8) != 0 ? previewUiState.showSendAction : false, (506 & 16) != 0 ? previewUiState.confirmationText : null, (506 & 32) != 0 ? previewUiState.showDownloadAction : false, (506 & 64) != 0 ? previewUiState.fileSavingText : null, (506 & 128) != 0 ? previewUiState.fileSavedText : null, (506 & 256) != 0 ? previewUiState.saveFailedText : null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final void saveFile$intercom_sdk_ui_release(IntercomPreviewFile file, Context context) {
        boolean z10;
        i.e(file, "file");
        i.e(context, "context");
        InterfaceC2694i0 interfaceC2694i0 = this.downloadJob;
        if (interfaceC2694i0 != null) {
            z10 = interfaceC2694i0.c();
        }
        if (!(file instanceof IntercomPreviewFile.NetworkFile) || z10) {
            return;
        }
        Toast.makeText(context, this._state.getValue().getFileSavingText(), 0).show();
        String mimeType = file.getMimeType(context);
        if (ContentTypeExtensionKt.isImage(mimeType)) {
            saveImage((IntercomPreviewFile.NetworkFile) file, context);
        } else if (ContentTypeExtensionKt.isVideo(mimeType)) {
            saveVideo((IntercomPreviewFile.NetworkFile) file, context);
        } else {
            saveDocument((IntercomPreviewFile.NetworkFile) file, context);
        }
    }
}
