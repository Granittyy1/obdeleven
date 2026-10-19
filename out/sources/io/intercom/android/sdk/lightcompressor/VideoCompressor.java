package io.intercom.android.sdk.lightcompressor;

import Aa.c;
import Ia.p;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import androidx.compose.ui.text.font.s;
import io.intercom.android.sdk.lightcompressor.compressor.Compressor;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.config.SaveLocation;
import io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.G;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.N;
import p293xa.r;

/* JADX INFO: compiled from: VideoCompressor.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoCompressor implements A {
    public static final VideoCompressor INSTANCE = new VideoCompressor();
    private static InterfaceC2694i0 job;
    private final /* synthetic */ A $$delegate_0 = B.b();

    /* JADX INFO: compiled from: VideoCompressor.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SaveLocation.values().length];
            try {
                iArr[SaveLocation.downloads.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SaveLocation.pictures.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1, reason: invalid class name */
    /* JADX INFO: compiled from: VideoCompressor.kt */
    @c(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1", f = "VideoCompressor.kt", l = {me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowActionBar, 143}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ AppSpecificStorageConfiguration $appSpecificStorageConfiguration;
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $i;
        final /* synthetic */ boolean $isStreamable;
        final /* synthetic */ CompressionListener $listener;
        final /* synthetic */ SharedStorageConfiguration $sharedStorageConfiguration;
        final /* synthetic */ Ref$ObjectRef<File> $streamableFile;
        final /* synthetic */ List<Uri> $uris;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Context context, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, boolean z10, Configuration configuration, int i10, Ref$ObjectRef<File> ref$ObjectRef, List<? extends Uri> list, CompressionListener compressionListener, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$context = context;
            this.$sharedStorageConfiguration = sharedStorageConfiguration;
            this.$appSpecificStorageConfiguration = appSpecificStorageConfiguration;
            this.$isStreamable = z10;
            this.$configuration = configuration;
            this.$i = i10;
            this.$streamableFile = ref$ObjectRef;
            this.$uris = list;
            this.$listener = compressionListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, this.$isStreamable, this.$configuration, this.$i, this.$streamableFile, this.$uris, this.$listener, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0127  */
        /* JADX WARN: Code duplicated, block: B:29:0x0149  */
        /* JADX WARN: Code duplicated, block: B:30:0x014e  */
        /* JADX WARN: Code duplicated, block: B:32:0x0153  */
        /* JADX WARN: Code duplicated, block: B:34:0x0159  */
        /* JADX WARN: Type inference failed for: r0v15, types: [T, java.io.File] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objD;
            boolean z10;
            Object objStartCompression;
            CompressionListener compressionListener;
            int i10;
            Configuration configuration;
            AppSpecificStorageConfiguration appSpecificStorageConfiguration;
            SharedStorageConfiguration sharedStorageConfiguration;
            Context context;
            Result result;
            String failureMessage;
            File fileSaveVideoFile;
            String path;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    b.b(obj);
                    objD = obj;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z11 = this.Z$0;
                    i10 = this.I$0;
                    AppSpecificStorageConfiguration appSpecificStorageConfiguration2 = (AppSpecificStorageConfiguration) this.L$4;
                    SharedStorageConfiguration sharedStorageConfiguration2 = (SharedStorageConfiguration) this.L$3;
                    configuration = (Configuration) this.L$2;
                    Context context2 = (Context) this.L$1;
                    compressionListener = (CompressionListener) this.L$0;
                    b.b(obj);
                    z10 = z11;
                    appSpecificStorageConfiguration = appSpecificStorageConfiguration2;
                    sharedStorageConfiguration = sharedStorageConfiguration2;
                    context = context2;
                    objStartCompression = obj;
                }
                result = (Result) objStartCompression;
                if (result.getSuccess()) {
                    fileSaveVideoFile = VideoCompressor.INSTANCE.saveVideoFile(context, result.getPath(), sharedStorageConfiguration, appSpecificStorageConfiguration, Boolean.valueOf(z10), configuration.getVideoNames().get(i10), Boolean.TRUE);
                    long size = result.getSize();
                    if (fileSaveVideoFile != null) {
                        path = fileSaveVideoFile.getPath();
                    } else {
                        path = null;
                    }
                    compressionListener.onSuccess(i10, size, path);
                } else {
                    failureMessage = result.getFailureMessage();
                    if (failureMessage == null) {
                        failureMessage = "An error has occurred!";
                    }
                    compressionListener.onFailure(i10, failureMessage);
                }
                return r.f47939a;
            }
            b.b(obj);
            G gA = C2680e.a((A) this.L$0, null, new VideoCompressor$doVideoCompression$1$job$1(this.$context, this.$uris, this.$i, null), 3);
            this.label = 1;
            objD = gA.D(this);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
            String str = (String) objD;
            VideoCompressor videoCompressor = VideoCompressor.INSTANCE;
            Context context3 = this.$context;
            SharedStorageConfiguration sharedStorageConfiguration3 = this.$sharedStorageConfiguration;
            AppSpecificStorageConfiguration appSpecificStorageConfiguration3 = this.$appSpecificStorageConfiguration;
            Boolean boolValueOf = Boolean.valueOf(this.$isStreamable);
            String str2 = this.$configuration.getVideoNames().get(this.$i);
            Boolean bool = Boolean.FALSE;
            File fileSaveVideoFile2 = videoCompressor.saveVideoFile(context3, str, sharedStorageConfiguration3, appSpecificStorageConfiguration3, boolValueOf, str2, bool);
            if (this.$isStreamable) {
                this.$streamableFile.element = videoCompressor.saveVideoFile(this.$context, str, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, null, this.$configuration.getVideoNames().get(this.$i), bool);
            }
            if (fileSaveVideoFile2 != null) {
                CompressionListener compressionListener2 = this.$listener;
                int i12 = this.$i;
                Context context4 = this.$context;
                List<Uri> list = this.$uris;
                Ref$ObjectRef<File> ref$ObjectRef = this.$streamableFile;
                Configuration configuration2 = this.$configuration;
                SharedStorageConfiguration sharedStorageConfiguration4 = this.$sharedStorageConfiguration;
                AppSpecificStorageConfiguration appSpecificStorageConfiguration4 = this.$appSpecificStorageConfiguration;
                boolean z12 = this.$isStreamable;
                Compressor.INSTANCE.setRunning(true);
                compressionListener2.onStart(i12);
                Uri uri = list.get(i12);
                String path2 = fileSaveVideoFile2.getPath();
                i.d(path2, "getPath(...)");
                File file = ref$ObjectRef.element;
                String path3 = file != null ? file.getPath() : null;
                this.L$0 = compressionListener2;
                this.L$1 = context4;
                this.L$2 = configuration2;
                this.L$3 = sharedStorageConfiguration4;
                this.L$4 = appSpecificStorageConfiguration4;
                this.I$0 = i12;
                this.Z$0 = z12;
                this.label = 2;
                z10 = z12;
                objStartCompression = videoCompressor.startCompression(i12, context4, uri, path2, path3, configuration2, compressionListener2, this);
                if (objStartCompression == coroutineSingletons) {
                    return coroutineSingletons;
                }
                compressionListener = compressionListener2;
                i10 = i12;
                configuration = configuration2;
                appSpecificStorageConfiguration = appSpecificStorageConfiguration4;
                sharedStorageConfiguration = sharedStorageConfiguration4;
                context = context4;
                result = (Result) objStartCompression;
                if (result.getSuccess()) {
                    fileSaveVideoFile = VideoCompressor.INSTANCE.saveVideoFile(context, result.getPath(), sharedStorageConfiguration, appSpecificStorageConfiguration, Boolean.valueOf(z10), configuration.getVideoNames().get(i10), Boolean.TRUE);
                    long size2 = result.getSize();
                    if (fileSaveVideoFile != null) {
                        path = fileSaveVideoFile.getPath();
                    } else {
                        path = null;
                    }
                    compressionListener.onSuccess(i10, size2, path);
                } else {
                    failureMessage = result.getFailureMessage();
                    if (failureMessage == null) {
                        failureMessage = "An error has occurred!";
                    }
                    compressionListener.onFailure(i10, failureMessage);
                }
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.lightcompressor.VideoCompressor$startCompression$2, reason: invalid class name */
    /* JADX INFO: compiled from: VideoCompressor.kt */
    @c(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$startCompression$2", f = "VideoCompressor.kt", l = {183}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super Result>, Object> {
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $destPath;
        final /* synthetic */ int $index;
        final /* synthetic */ CompressionListener $listener;
        final /* synthetic */ Uri $srcUri;
        final /* synthetic */ String $streamableFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i10, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$index = i10;
            this.$context = context;
            this.$srcUri = uri;
            this.$destPath = str;
            this.$streamableFile = str2;
            this.$configuration = configuration;
            this.$listener = compressionListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.$index, this.$context, this.$srcUri, this.$destPath, this.$streamableFile, this.$configuration, this.$listener, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                Compressor compressor = Compressor.INSTANCE;
                int i11 = this.$index;
                Context context = this.$context;
                Uri uri = this.$srcUri;
                String str = this.$destPath;
                String str2 = this.$streamableFile;
                Configuration configuration = this.$configuration;
                final CompressionListener compressionListener = this.$listener;
                CompressionProgressListener compressionProgressListener = new CompressionProgressListener() { // from class: io.intercom.android.sdk.lightcompressor.VideoCompressor.startCompression.2.1
                    @Override // io.intercom.android.sdk.lightcompressor.CompressionProgressListener
                    public void onProgressCancelled(int i12) {
                        compressionListener.onCancelled(i12);
                    }

                    @Override // io.intercom.android.sdk.lightcompressor.CompressionProgressListener
                    public void onProgressChanged(int i12, float f10) {
                        compressionListener.onProgress(i12, f10);
                    }
                };
                this.label = 1;
                obj = compressor.compressVideo(i11, context, uri, str, str2, configuration, compressionProgressListener, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return obj;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super Result> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    private VideoCompressor() {
    }

    public static final void cancel() {
        InterfaceC2694i0 interfaceC2694i0 = job;
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(null);
        }
        Compressor.INSTANCE.setRunning(false);
    }

    private final void doVideoCompression(Context context, List<? extends Uri> list, boolean z10, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            job = C2680e.c(this, N.f43200c, null, new AnonymousClass1(context, sharedStorageConfiguration, appSpecificStorageConfiguration, z10, configuration, i10, ref$ObjectRef, list, compressionListener, null), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final String getMediaPath(Context context, Uri uri) throws Throwable {
        ContentResolver contentResolver = context.getContentResolver();
        ?? r10 = 0;
        ?? Query = contentResolver;
        try {
            try {
                Query = Query.query(uri, new String[]{"_data"}, null, null, null);
                try {
                    if (Query == 0) {
                        throw new Exception();
                    }
                    int columnIndexOrThrow = Query.getColumnIndexOrThrow("_data");
                    Query.moveToFirst();
                    String string = Query.getString(columnIndexOrThrow);
                    i.b(string);
                    Query.close();
                    return string;
                } catch (Exception unused) {
                    File file = new File(context.getApplicationInfo().dataDir + File.separator + System.currentTimeMillis());
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i10 = inputStreamOpenInputStream.read(bArr);
                                    if (i10 <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                    try {
                                        throw th;
                                    } catch (Throwable th) {
                                        p241t7.b.n(inputStreamOpenInputStream, th);
                                        throw th;
                                    }
                                }
                                r rVar = r.f47939a;
                                p241t7.b.n(fileOutputStream, null);
                                p241t7.b.n(inputStreamOpenInputStream, null);
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
                    String absolutePath = file.getAbsolutePath();
                    i.d(absolutePath, "getAbsolutePath(...)");
                    if (Query != 0) {
                        Query.close();
                    }
                    return absolutePath;
                }
            } catch (Throwable th5) {
                th = th5;
                r10 = Query;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            Query = 0;
        } catch (Throwable th6) {
            th = th6;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File saveVideoFile(Context context, String str, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Boolean bool, String str2, Boolean bool2) throws IOException {
        String str3;
        String path;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (sharedStorageConfiguration == null) {
            String strValidatedFileName = INSTANCE.validatedFileName(str2, bool);
            i.b(appSpecificStorageConfiguration);
            if (appSpecificStorageConfiguration.getSubFolderName() != null) {
                strValidatedFileName = appSpecificStorageConfiguration.getSubFolderName() + '/' + strValidatedFileName;
            }
            if (!new File(context.getFilesDir() + '/' + strValidatedFileName).exists()) {
                File parentFile = new File(context.getFilesDir() + '/' + strValidatedFileName).getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            return new File(context.getFilesDir(), strValidatedFileName);
        }
        VideoCompressor videoCompressor = INSTANCE;
        String strValidatedFileName2 = videoCompressor.validatedFileName(str2, bool);
        SaveLocation saveAt = sharedStorageConfiguration.getSaveAt();
        int i10 = saveAt == null ? -1 : WhenMappings.$EnumSwitchMapping$0[saveAt.ordinal()];
        if (i10 != 1) {
            str3 = i10 != 2 ? Environment.DIRECTORY_MOVIES : Environment.DIRECTORY_PICTURES;
        } else {
            str3 = Environment.DIRECTORY_DOWNLOADS;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (sharedStorageConfiguration.getSubFolderName() != null) {
                str3 = str3 + '/' + sharedStorageConfiguration.getSubFolderName();
            }
            if (!i.a(bool2, Boolean.TRUE)) {
                return new File(context.getFilesDir(), strValidatedFileName2);
            }
            i.b(str3);
            videoCompressor.saveVideoInExternal(context, strValidatedFileName2, str3, file);
            new File(context.getFilesDir(), strValidatedFileName2).delete();
            return new File("/storage/emulated/0/".concat(str3), strValidatedFileName2);
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str3);
        if (sharedStorageConfiguration.getSubFolderName() != null) {
            path = externalStoragePublicDirectory + '/' + sharedStorageConfiguration.getSubFolderName();
        } else {
            path = externalStoragePublicDirectory.getPath();
        }
        File file2 = new File(path, strValidatedFileName2);
        if (!file2.exists()) {
            try {
                File parentFile2 = file2.getParentFile();
                if (parentFile2 != null) {
                    parentFile2.mkdirs();
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        if (i.a(bool2, Boolean.TRUE)) {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(strValidatedFileName2, 0);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i11 = fileInputStream.read(bArr);
                        if (i11 <= 0) {
                            break;
                        }
                        fileOutputStreamOpenFileOutput.write(bArr, 0, i11);
                        try {
                            throw th;
                        } catch (Throwable th) {
                            p241t7.b.n(fileOutputStreamOpenFileOutput, th);
                            throw th;
                        }
                    }
                    r rVar = r.f47939a;
                    p241t7.b.n(fileInputStream, null);
                    p241t7.b.n(fileOutputStreamOpenFileOutput, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        p241t7.b.n(fileInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return file2;
    }

    private final void saveVideoInExternal(Context context, String str, String str2, File file) throws IOException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("relative_path", str2);
        contentValues.put("is_pending", (Integer) 1);
        Uri contentUri = MediaStore.Video.Media.getContentUri("external_primary");
        if (i.a(str2, Environment.DIRECTORY_DOWNLOADS)) {
            contentUri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        }
        Uri uriInsert = context.getContentResolver().insert(contentUri, contentValues);
        if (uriInsert != null) {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uriInsert, "rw");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i10 = fileInputStream.read(bArr);
                                if (i10 <= 0) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    p241t7.b.n(fileOutputStream, th);
                                    throw th;
                                }
                            }
                            r rVar = r.f47939a;
                            p241t7.b.n(fileInputStream, null);
                            p241t7.b.n(fileOutputStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                p241t7.b.n(fileInputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        p241t7.b.n(parcelFileDescriptorOpenFileDescriptor, th5);
                        throw th6;
                    }
                }
            }
            p241t7.b.n(parcelFileDescriptorOpenFileDescriptor, null);
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            context.getContentResolver().update(uriInsert, contentValues, null, null);
        }
    }

    public static final void start(Context context, List<? extends Uri> uris, Configuration configureWith, CompressionListener listener) {
        i.e(context, "context");
        i.e(uris, "uris");
        i.e(configureWith, "configureWith");
        i.e(listener, "listener");
        start$default(context, uris, false, null, null, configureWith, listener, 28, null);
    }

    public static /* synthetic */ void start$default(Context context, List list, boolean z10, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        start(context, list, z10, (i10 & 8) != 0 ? null : sharedStorageConfiguration, (i10 & 16) != 0 ? null : appSpecificStorageConfiguration, configuration, compressionListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startCompression(int i10, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, kotlin.coroutines.c<? super Result> cVar) {
        return C2680e.f(N.f43198a, new AnonymousClass2(i10, context, uri, str, str2, configuration, compressionListener, null), cVar);
    }

    private final String validatedFileName(String str, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            str = s.b(str, "_temp");
        }
        return !n.J(str, "mp4", false) ? str.concat(".mp4") : str;
    }

    @Override // kotlinx.coroutines.A
    public e getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public static final void start(Context context, List<? extends Uri> uris, boolean z10, Configuration configureWith, CompressionListener listener) {
        i.e(context, "context");
        i.e(uris, "uris");
        i.e(configureWith, "configureWith");
        i.e(listener, "listener");
        start$default(context, uris, z10, null, null, configureWith, listener, 24, null);
    }

    public static final void start(Context context, List<? extends Uri> uris, boolean z10, SharedStorageConfiguration sharedStorageConfiguration, Configuration configureWith, CompressionListener listener) {
        i.e(context, "context");
        i.e(uris, "uris");
        i.e(configureWith, "configureWith");
        i.e(listener, "listener");
        start$default(context, uris, z10, sharedStorageConfiguration, null, configureWith, listener, 16, null);
    }

    public static final void start(Context context, List<? extends Uri> uris, boolean z10, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configureWith, CompressionListener listener) {
        i.e(context, "context");
        i.e(uris, "uris");
        i.e(configureWith, "configureWith");
        i.e(listener, "listener");
        configureWith.getVideoNames().size();
        uris.size();
        INSTANCE.doVideoCompression(context, uris, z10, sharedStorageConfiguration, appSpecificStorageConfiguration, configureWith, listener);
    }
}
