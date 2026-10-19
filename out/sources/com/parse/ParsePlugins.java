package com.parse;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import okhttp3.o;
import okhttp3.q;
import okhttp3.t;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: loaded from: classes3.dex */
public class ParsePlugins {
    private static final Object LOCK = new Object();
    private static ParsePlugins instance;
    private Context applicationContext;
    File cacheDir;
    private final Parse.Configuration configuration;
    ParseHttpClient fileClient;
    File filesDir;
    private InstallationId installationId;
    final Object lock = new Object();
    File parseDir;
    ParseHttpClient restClient;

    private ParsePlugins(Context context, Parse.Configuration configuration) {
        if (context != null) {
            this.applicationContext = context.getApplicationContext();
        }
        this.configuration = configuration;
    }

    private static File createFileDir(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static ParsePlugins get() {
        ParsePlugins parsePlugins;
        synchronized (LOCK) {
            parsePlugins = instance;
        }
        return parsePlugins;
    }

    public static void initialize(Context context, Parse.Configuration configuration) {
        set(new ParsePlugins(context, configuration));
    }

    public static void set(ParsePlugins parsePlugins) {
        synchronized (LOCK) {
            try {
                if (instance != null) {
                    throw new IllegalStateException("ParsePlugins is already initialized");
                }
                instance = parsePlugins;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context applicationContext() {
        return this.applicationContext;
    }

    public String applicationId() {
        return this.configuration.applicationId;
    }

    public Parse.Configuration configuration() {
        return this.configuration;
    }

    public ParseHttpClient fileClient() {
        ParseHttpClient parseHttpClient;
        synchronized (this.lock) {
            try {
                if (this.fileClient == null) {
                    this.fileClient = ParseHttpClient.createClient(this.configuration.clientBuilder);
                }
                parseHttpClient = this.fileClient;
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseHttpClient;
    }

    public File getCacheDir() {
        File fileCreateFileDir;
        synchronized (this.lock) {
            try {
                if (this.cacheDir == null) {
                    this.cacheDir = new File(this.applicationContext.getCacheDir(), "com.parse");
                }
                fileCreateFileDir = createFileDir(this.cacheDir);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileCreateFileDir;
    }

    public File getFilesDir() {
        File fileCreateFileDir;
        synchronized (this.lock) {
            try {
                if (this.filesDir == null) {
                    this.filesDir = new File(this.applicationContext.getFilesDir(), "com.parse");
                }
                fileCreateFileDir = createFileDir(this.filesDir);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileCreateFileDir;
    }

    @Deprecated
    public File getParseDir() {
        File fileCreateFileDir;
        synchronized (this.lock) {
            try {
                if (this.parseDir == null) {
                    this.parseDir = this.applicationContext.getDir("Parse", 0);
                }
                fileCreateFileDir = createFileDir(this.parseDir);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileCreateFileDir;
    }

    public InstallationId installationId() {
        InstallationId installationId;
        synchronized (this.lock) {
            try {
                if (this.installationId == null) {
                    this.installationId = new InstallationId(new File(getParseDir(), "installationId"));
                }
                installationId = this.installationId;
            } catch (Throwable th) {
                throw th;
            }
        }
        return installationId;
    }

    public ParseHttpClient restClient() {
        ParseHttpClient parseHttpClient;
        synchronized (this.lock) {
            try {
                if (this.restClient == null) {
                    t.a aVar = this.configuration.clientBuilder;
                    if (aVar == null) {
                        aVar = new t.a();
                    }
                    aVar.f45638c.add(0, new q() { // from class: com.parse.ParsePlugins.1
                        @Override // okhttp3.q
                        public z intercept(q.a aVar2) throws IOException {
                            u uVarRequest = aVar2.request();
                            o.a aVarQ = uVarRequest.f45663c.q();
                            aVarQ.h("X-Parse-Application-Id", ParsePlugins.this.configuration.applicationId);
                            aVarQ.h("X-Parse-App-Build-Version", String.valueOf(ManifestInfo.getVersionCode()));
                            aVarQ.h("X-Parse-App-Display-Version", ManifestInfo.getVersionName());
                            aVarQ.h("X-Parse-OS-Version", Build.VERSION.RELEASE);
                            aVarQ.h("User-Agent", ParsePlugins.this.userAgent());
                            if (uVarRequest.f45663c.e("X-Parse-Installation-Id") == null) {
                                aVarQ.h("X-Parse-Installation-Id", ParsePlugins.this.installationId().get());
                            }
                            if (ParsePlugins.this.configuration.clientKey != null) {
                                aVarQ.h("X-Parse-Client-Key", ParsePlugins.this.configuration.clientKey);
                            }
                            u.a aVarB = uVarRequest.b();
                            aVarB.d(aVarQ.e());
                            return aVar2.a(aVarB.a());
                        }
                    });
                    this.restClient = ParseHttpClient.createClient(aVar);
                }
                parseHttpClient = this.restClient;
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseHttpClient;
    }

    public String userAgent() {
        return "Parse Android SDK API Level " + Build.VERSION.SDK_INT;
    }
}
