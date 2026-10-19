package com.braze.support;

import Fa.b.C0036b;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.TrafficStats;
import android.net.Uri;
import bo.app.d7;
import com.braze.Braze;
import com.braze.Constants;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.l;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlin.text.n;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeFileUtils {
    private static final String FILE_SCHEME = "file";
    private static final String SHARED_PREFERENCES_FILENAME_SUFFIX = ".xml";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeFileUtils");
    public static final List<String> REMOTE_SCHEMES = l.s("http", "https", "ftp", "ftps", "about", "javascript");

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f24226b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(0);
            this.f24226b = file;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not recursively delete " + this.f24226b.getName();
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f24227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file) {
            super(0);
            this.f24227b = file;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot delete SharedPreferences that does not exist. Path: " + this.f24227b.getAbsolutePath();
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f24228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(0);
            this.f24228b = file;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SharedPreferences file is expected to end in .xml. Path: " + this.f24228b.getAbsolutePath();
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f24229b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is offline. File not downloaded for url: " + this.f24229b;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f24230b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Download directory null or blank. File not downloaded.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f24231b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Zip file url null or blank. File not downloaded.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f24232b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Output filename null or blank. File not downloaded.";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24234c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, String str) {
            super(0);
            this.f24233b = i10;
            this.f24234c = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("HTTP response code was ");
            sb2.append(this.f24233b);
            sb2.append(". File with url ");
            return Q8.d.a(sb2, this.f24234c, " could not be downloaded.");
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24235b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.f24235b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception during download of file from url : " + this.f24235b;
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f24236b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Null or blank Uri scheme.";
        }
    }

    public static final void deleteFileOrDirectory(File fileOrDirectory) {
        boolean z10;
        kotlin.jvm.internal.i.e(fileOrDirectory, "fileOrDirectory");
        FileWalkDirection fileWalkDirection = FileWalkDirection.f43043b;
        Fa.b.C0036b c0036b = new Fa.b(fileOrDirectory).new C0036b();
        loop0: while (true) {
            z10 = true;
            while (true) {
                if (!c0036b.hasNext()) {
                    break loop0;
                }
                File next = c0036b.next();
                if (next.delete() || !next.exists()) {
                    if (z10) {
                        break;
                    }
                }
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new a(fileOrDirectory), 4, (Object) null);
    }

    public static final void deleteSharedPreferencesFile(Context context, File file) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(file, "file");
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new b(file), 4, (Object) null);
            return;
        }
        String fileName = file.getName();
        kotlin.jvm.internal.i.d(fileName, "fileName");
        if (m.C(fileName, SHARED_PREFERENCES_FILENAME_SUFFIX, false)) {
            context.deleteSharedPreferences(n.a0(fileName, SHARED_PREFERENCES_FILENAME_SUFFIX));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new c(file), 4, (Object) null);
        }
    }

    public static final Pair<File, Map<String, String>> downloadFileToPath(String downloadDirectoryAbsolutePath, String remoteFileUrl, String outputFilename, String str) throws Exception {
        kotlin.jvm.internal.i.e(downloadDirectoryAbsolutePath, "downloadDirectoryAbsolutePath");
        kotlin.jvm.internal.i.e(remoteFileUrl, "remoteFileUrl");
        kotlin.jvm.internal.i.e(outputFilename, "outputFilename");
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        if (Braze.Companion.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) new d(remoteFileUrl), 4, (Object) null);
            throw new Exception("SDK is offline. File not downloaded for url: ".concat(remoteFileUrl));
        }
        if (n.S(downloadDirectoryAbsolutePath)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) e.f24230b, 4, (Object) null);
            throw new Exception("Download directory is blank. File not downloaded.");
        }
        if (n.S(remoteFileUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) f.f24231b, 4, (Object) null);
            throw new Exception("Zip file url is blank. File not downloaded.");
        }
        if (n.S(outputFilename)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) g.f24232b, 4, (Object) null);
            throw new Exception("Output filename is blank. File not downloaded.");
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                new File(downloadDirectoryAbsolutePath).mkdirs();
                if (str != null && !n.S(str)) {
                    outputFilename = outputFilename.concat(str);
                }
                File file = new File(downloadDirectoryAbsolutePath, outputFilename);
                HttpURLConnection httpURLConnectionA = d7.f20875a.a(new URL(remoteFileUrl));
                try {
                    int responseCode = httpURLConnectionA.getResponseCode();
                    if (responseCode != 200) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new h(responseCode, remoteFileUrl), 6, (Object) null);
                        throw new Exception("HTTP response code was " + responseCode + ". File with url " + remoteFileUrl + " could not be downloaded.");
                    }
                    DataInputStream dataInputStream = new DataInputStream(httpURLConnectionA.getInputStream());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            v.b(dataInputStream, fileOutputStream);
                            p241t7.b.n(fileOutputStream, null);
                            p241t7.b.n(dataInputStream, null);
                            Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
                            kotlin.jvm.internal.i.d(headerFields, "urlConnection.headerFields");
                            Map mapA = com.braze.support.g.a(headerFields);
                            httpURLConnectionA.disconnect();
                            return new Pair<>(file, mapA);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                p241t7.b.n(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            p241t7.b.n(dataInputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Exception e10) {
                    httpURLConnection = httpURLConnectionA;
                    e = e10;
                    BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e, (Ia.a<String>) new i(remoteFileUrl));
                    throw new Exception("Exception during download of file from url : ".concat(remoteFileUrl));
                } catch (Throwable th5) {
                    httpURLConnection = httpURLConnectionA;
                    th = th5;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public static /* synthetic */ Pair downloadFileToPath$default(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        return downloadFileToPath(str, str2, str3, str4);
    }

    public static final String getAssetFileStringContents(AssetManager assetManager, String assetPath) throws IOException {
        kotlin.jvm.internal.i.e(assetManager, "<this>");
        kotlin.jvm.internal.i.e(assetPath, "assetPath");
        InputStream inputStreamOpen = assetManager.open(assetPath);
        kotlin.jvm.internal.i.d(inputStreamOpen, "this.open(assetPath)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, kotlin.text.a.f43120b), 8192);
        try {
            String strE = p006a5.a.e(bufferedReader);
            p241t7.b.n(bufferedReader, null);
            return strE;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p241t7.b.n(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static final boolean isLocalUri(Uri uri) {
        kotlin.jvm.internal.i.e(uri, "<this>");
        String scheme = uri.getScheme();
        return scheme == null || n.S(scheme) || kotlin.jvm.internal.i.a(scheme, FILE_SCHEME);
    }

    public static final boolean isRemoteUri(Uri uri) {
        kotlin.jvm.internal.i.e(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme != null && !n.S(scheme)) {
            return REMOTE_SCHEMES.contains(scheme);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) j.f24236b, 4, (Object) null);
        return false;
    }
}
