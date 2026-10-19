package com.braze.support;

import android.content.Context;
import com.braze.Constants;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.m;
import kotlin.text.n;
import p293xa.r;

/* JADX INFO: loaded from: classes.dex */
public final class WebContentUtils {
    public static final String ASSET_LOADER_DUMMY_DOMAIN = "iamcache.braze";
    public static final String HTML_INAPP_MESSAGES_FOLDER = "braze-html-inapp-messages";
    public static final WebContentUtils INSTANCE = new WebContentUtils();
    private static final String ZIP_EXTENSION = ".zip";

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24340b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Remote zip url is empty. No local URL will be created.";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24342c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.f24341b = str;
            this.f24342c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Starting download of url: " + this.f24341b + " to " + this.f24342c;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f24343b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not download zip file to local storage. " + this.f24343b;
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(0);
            this.f24344b = str;
            this.f24345c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Html content zip downloaded. " + this.f24344b + " to " + this.f24345c;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f24346b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error during the zip unpack.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24347b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f24347b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Html content zip unpacked to to "), this.f24347b, '.');
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24348b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.f24348b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot find local asset file at path: " + this.f24348b;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24350c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2) {
            super(0);
            this.f24349b = str;
            this.f24350c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Replacing remote url \"");
            sb2.append(this.f24349b);
            sb2.append("\" with local uri \"");
            return B7.b.g(sb2, this.f24350c, '\"');
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f24351b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unpack directory is blank. Zip file not unpacked.";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f24352b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Ref$ObjectRef ref$ObjectRef) {
            super(0);
            this.f24352b = ref$ObjectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error creating parent directory " + ((String) this.f24352b.element);
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f24353b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Ref$ObjectRef ref$ObjectRef) {
            super(0);
            this.f24353b = ref$ObjectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error unpacking zipEntry " + ((String) this.f24353b.element);
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f24354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24355c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(File file, String str) {
            super(0);
            this.f24354b = file;
            this.f24355c = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Error during unpack of zip file ");
            sb2.append(this.f24354b.getAbsolutePath());
            sb2.append(" to ");
            return B7.b.g(sb2, this.f24355c, '.');
        }
    }

    private WebContentUtils() {
    }

    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        return new File(context.getCacheDir().getPath() + "/braze-html-inapp-messages");
    }

    public static final String getLocalHtmlUrlFromRemoteUrl(File localDirectory, String remoteZipUrl) {
        kotlin.jvm.internal.i.e(localDirectory, "localDirectory");
        kotlin.jvm.internal.i.e(remoteZipUrl, "remoteZipUrl");
        if (n.S(remoteZipUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, a.f24340b, 2, (Object) null);
            return null;
        }
        String absolutePath = localDirectory.getAbsolutePath();
        String strValueOf = String.valueOf(IntentUtils.getRequestCode());
        String str = absolutePath + '/' + strValueOf;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new b(remoteZipUrl, str), 3, (Object) null);
        try {
            File fileA = BrazeFileUtils.downloadFileToPath(str, remoteZipUrl, strValueOf, ZIP_EXTENSION).a();
            BrazeLogger.brazelog$default(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new d(remoteZipUrl, str), 3, (Object) null);
            if (unpackZipIntoDirectory(str, fileA)) {
                BrazeLogger.brazelog$default(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new f(str), 3, (Object) null);
                return str;
            }
            BrazeLogger.brazelog$default(brazeLogger, webContentUtils, BrazeLogger.Priority.W, (Throwable) null, e.f24346b, 2, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new c(remoteZipUrl));
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        }
    }

    public static final String replacePrefetchedUrlsWithLocalAssets(String originalString, Map<String, String> remoteToLocalAssetMap) {
        kotlin.jvm.internal.i.e(originalString, "originalString");
        kotlin.jvm.internal.i.e(remoteToLocalAssetMap, "remoteToLocalAssetMap");
        for (Map.Entry<String, String> entry : remoteToLocalAssetMap.entrySet()) {
            String value = entry.getValue();
            if (new File(value).exists()) {
                String key = entry.getKey();
                if (n.J(value, Constants.TRIGGERS_ASSETS_FOLDER, false)) {
                    String strC = B7.b.c("https://iamcache.braze/ab_triggers", (String) n.e0(value, new String[]{Constants.TRIGGERS_ASSETS_FOLDER}, 0, 6).get(1));
                    if (n.J(originalString, key, false)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new h(key, strC), 3, (Object) null);
                        originalString = m.G(originalString, key, strC);
                    }
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new g(value), 2, (Object) null);
            }
        }
        return originalString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, java.lang.String] */
    public static final boolean unpackZipIntoDirectory(String unpackDirectory, File zipFile) {
        kotlin.jvm.internal.i.e(unpackDirectory, "unpackDirectory");
        kotlin.jvm.internal.i.e(zipFile, "zipFile");
        if (n.S(unpackDirectory)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, i.f24351b, 2, (Object) null);
            return false;
        }
        new File(unpackDirectory).mkdirs();
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    ?? name = nextEntry.getName();
                    kotlin.jvm.internal.i.d(name, "zipEntry.name");
                    ref$ObjectRef.element = name;
                    Locale US = Locale.US;
                    kotlin.jvm.internal.i.d(US, "US");
                    String lowerCase = name.toLowerCase(US);
                    kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (!m.I(lowerCase, "__macosx", false)) {
                        try {
                            String strValidateChildFileExistsUnderParent = validateChildFileExistsUnderParent(unpackDirectory, unpackDirectory + '/' + ((String) ref$ObjectRef.element));
                            if (nextEntry.isDirectory()) {
                                new File(strValidateChildFileExistsUnderParent).mkdirs();
                            } else {
                                try {
                                    File parentFile = new File(strValidateChildFileExistsUnderParent).getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                    }
                                } catch (Exception e10) {
                                    BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new j(ref$ObjectRef));
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(strValidateChildFileExistsUnderParent));
                                try {
                                    v.b(zipInputStream, bufferedOutputStream);
                                    p241t7.b.n(bufferedOutputStream, null);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        p241t7.b.n(bufferedOutputStream, th);
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e11, new k(ref$ObjectRef));
                        }
                    }
                    zipInputStream.closeEntry();
                }
                r rVar = r.f47939a;
                p241t7.b.n(zipInputStream, null);
                return true;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    p241t7.b.n(zipInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, th5, new l(zipFile, unpackDirectory));
            return false;
        }
    }

    public static final String validateChildFileExistsUnderParent(String intendedParentDirectory, String childFilePath) throws IOException {
        kotlin.jvm.internal.i.e(intendedParentDirectory, "intendedParentDirectory");
        kotlin.jvm.internal.i.e(childFilePath, "childFilePath");
        String parentCanonicalPath = new File(intendedParentDirectory).getCanonicalPath();
        String childFileCanonicalPath = new File(childFilePath).getCanonicalPath();
        kotlin.jvm.internal.i.d(childFileCanonicalPath, "childFileCanonicalPath");
        kotlin.jvm.internal.i.d(parentCanonicalPath, "parentCanonicalPath");
        if (m.I(childFileCanonicalPath, parentCanonicalPath, false)) {
            return childFileCanonicalPath;
        }
        StringBuilder sbC = B6.a.c("Invalid file with original path: ", childFilePath, " with canonical path: ", childFileCanonicalPath, " does not exist under intended parent with  path: ");
        sbC.append(intendedParentDirectory);
        sbC.append(" and canonical path: ");
        sbC.append(parentCanonicalPath);
        throw new IllegalStateException(sbC.toString());
    }
}
