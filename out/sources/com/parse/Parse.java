package com.parse;

import android.content.Context;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import okhttp3.t;

/* JADX INFO: loaded from: classes3.dex */
public class Parse {
    private static final Object MUTEX = new Object();
    private static final Object MUTEX_CALLBACKS = new Object();
    private static Set<ParseCallbacks> callbacks = new HashSet();
    static ParseEventuallyQueue eventuallyQueue;
    private static boolean isLocalDatastoreEnabled;
    private static OfflineStore offlineStore;

    public static final class Configuration {
        final String applicationId;
        final t.a clientBuilder;
        final String clientKey;
        final Context context;
        final boolean localDataStoreEnabled;
        final int maxRetries;
        final String server;

        public static final class Builder {
            private String applicationId;
            private t.a clientBuilder;
            private String clientKey;
            private Context context;
            private boolean localDataStoreEnabled;
            private int maxRetries = 4;
            private String server;

            public Builder(Context context) {
                this.context = context;
            }

            public Builder applicationId(String str) {
                this.applicationId = str;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            }

            public Builder clientBuilder(t.a aVar) {
                this.clientBuilder = aVar;
                return this;
            }

            public Builder maxRetries(int i10) {
                this.maxRetries = i10;
                return this;
            }

            public Builder server(String str) {
                this.server = Parse.validateServerUrl(str);
                return this;
            }
        }

        private Configuration(Builder builder) {
            this.context = builder.context;
            this.applicationId = builder.applicationId;
            this.clientKey = builder.clientKey;
            this.server = builder.server;
            this.localDataStoreEnabled = builder.localDataStoreEnabled;
            this.clientBuilder = builder.clientBuilder;
            this.maxRetries = builder.maxRetries;
        }
    }

    public interface ParseCallbacks {
        void onParseInitialized();
    }

    private static boolean allParsePushIntentReceiversInternal() {
        Iterator<ResolveInfo> it = ManifestInfo.getIntentReceivers("com.parse.push.intent.RECEIVE", "com.parse.push.intent.DELETE", "com.parse.push.intent.OPEN").iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.exported) {
                return false;
            }
        }
        return true;
    }

    public static void checkCacheApplicationId() {
        boolean zEquals;
        synchronized (MUTEX) {
            String strApplicationId = ParsePlugins.get().applicationId();
            if (strApplicationId != null) {
                File parseCacheDir = getParseCacheDir();
                File file = new File(parseCacheDir, "applicationId");
                if (file.exists()) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        randomAccessFile.close();
                        zEquals = new String(bArr, "UTF-8").equals(strApplicationId);
                    } catch (IOException unused) {
                        zEquals = false;
                    }
                    if (!zEquals) {
                        try {
                            ParseFileUtils.deleteDirectory(parseCacheDir);
                        } catch (IOException unused2) {
                        }
                    }
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(parseCacheDir, "applicationId"));
                    fileOutputStream.write(strApplicationId.getBytes("UTF-8"));
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    public static void checkContext() {
        if (ParsePlugins.get().applicationContext() == null) {
            throw new RuntimeException("applicationContext is null. You must call Parse.initialize(Context) before using the Parse library.");
        }
    }

    private static ParseCallbacks[] collectParseCallbacks() {
        synchronized (MUTEX_CALLBACKS) {
            try {
                Set<ParseCallbacks> set = callbacks;
                if (set == null) {
                    return null;
                }
                ParseCallbacks[] parseCallbacksArr = new ParseCallbacks[set.size()];
                if (callbacks.size() > 0) {
                    parseCallbacksArr = (ParseCallbacks[]) callbacks.toArray(parseCallbacksArr);
                }
                return parseCallbacksArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void dispatchOnParseInitialized() {
        ParseCallbacks[] parseCallbacksArrCollectParseCallbacks = collectParseCallbacks();
        if (parseCallbacksArrCollectParseCallbacks != null) {
            for (ParseCallbacks parseCallbacks : parseCallbacksArrCollectParseCallbacks) {
                parseCallbacks.onParseInitialized();
            }
        }
    }

    public static void enableLocalDatastore(Context context) {
        if (isInitialized()) {
            throw new IllegalStateException("`Parse#enableLocalDatastore(Context)` must be invoked before `Parse#initialize(Context)`");
        }
        isLocalDatastoreEnabled = true;
    }

    public static Context getApplicationContext() {
        checkContext();
        return ParsePlugins.get().applicationContext();
    }

    public static ParseEventuallyQueue getEventuallyQueue() {
        return getEventuallyQueue(ParsePlugins.get().applicationContext());
    }

    public static OfflineStore getLocalDatastore() {
        return offlineStore;
    }

    public static int getLogLevel() {
        return PLog.getLogLevel();
    }

    public static File getParseCacheDir() {
        return ParsePlugins.get().getCacheDir();
    }

    @Deprecated
    public static File getParseDir() {
        return ParsePlugins.get().getParseDir();
    }

    public static boolean hasPermission(String str) {
        return getApplicationContext().checkCallingOrSelfPermission(str) == 0;
    }

    public static void initialize(Configuration configuration) {
        initialize(configuration, null);
    }

    public static boolean isInitialized() {
        return ParsePlugins.get() != null;
    }

    public static boolean isLocalDatastoreEnabled() {
        return isLocalDatastoreEnabled;
    }

    public static void requirePermission(String str) {
        if (!hasPermission(str)) {
            throw new IllegalStateException(d.b("To use this functionality, add this to your AndroidManifest.xml:\n<uses-permission android:name=\"", str, "\" />"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String validateServerUrl(String str) {
        return (str == null || str.endsWith("/")) ? str : str.concat("/");
    }

    public static File getParseCacheDir(String str) {
        File file;
        synchronized (MUTEX) {
            try {
                file = new File(getParseCacheDir(), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public static void initialize(Configuration configuration, ParsePlugins parsePlugins) {
        if (isInitialized()) {
            PLog.w("com.parse.Parse", "Parse is already initialized");
            return;
        }
        isLocalDatastoreEnabled = configuration.localDataStoreEnabled;
        if (parsePlugins == null) {
            ParsePlugins.initialize(configuration.context, configuration);
        } else {
            ParsePlugins.set(parsePlugins);
        }
        try {
            ParseRESTCommand.server = new URL(configuration.server);
            ParseObject.registerParseSubclasses();
            if (configuration.localDataStoreEnabled) {
                offlineStore = new OfflineStore(configuration.context);
            } else {
                ParseKeyValueCache.initialize(configuration.context);
            }
            checkCacheApplicationId();
            final Context context = configuration.context;
            Task.callInBackground(new Callable<Void>() { // from class: com.parse.Parse.1
                @Override // java.util.concurrent.Callable
                public Void call() {
                    Parse.getEventuallyQueue(context);
                    return null;
                }
            });
            ParseFieldOperations.registerDefaultDecoders();
            if (!allParsePushIntentReceiversInternal()) {
                throw new SecurityException("To prevent external tampering to your app's notifications, all receivers registered to handle the following actions must have their exported attributes set to false: com.parse.push.intent.RECEIVE, com.parse.push.intent.OPEN, com.parse.push.intent.DELETE");
            }
            ParseUser.getCurrentUserAsync().makeVoid().continueWith((Continuation<Void, TContinuationResult>) new Continuation<Void, Void>() { // from class: com.parse.Parse.2
                @Override // com.parse.boltsinternal.Continuation
                public Void then(Task<Void> task) {
                    ParseConfig.getCurrentConfig();
                    return null;
                }
            }, Task.BACKGROUND_EXECUTOR);
            dispatchOnParseInitialized();
            synchronized (MUTEX_CALLBACKS) {
                callbacks = null;
            }
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x001a A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0003, B:7:0x000d, B:13:0x0016, B:24:0x0041, B:25:0x0043, B:15:0x001a, B:17:0x0027, B:19:0x0032, B:21:0x0036, B:23:0x003c, B:18:0x002d), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0027 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0003, B:7:0x000d, B:13:0x0016, B:24:0x0041, B:25:0x0043, B:15:0x001a, B:17:0x0027, B:19:0x0032, B:21:0x0036, B:23:0x003c, B:18:0x002d), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x002d A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0003, B:7:0x000d, B:13:0x0016, B:24:0x0041, B:25:0x0043, B:15:0x001a, B:17:0x0027, B:19:0x0032, B:21:0x0036, B:23:0x003c, B:18:0x002d), top: B:29:0x0003 }] */
    public static ParseEventuallyQueue getEventuallyQueue(Context context) {
        ParseHttpClient parseHttpClientRestClient;
        ParseEventuallyQueue parseCommandCache;
        ParseEventuallyQueue parseEventuallyQueue;
        synchronized (MUTEX) {
            try {
                boolean zIsLocalDatastoreEnabled = isLocalDatastoreEnabled();
                ParseEventuallyQueue parseEventuallyQueue2 = eventuallyQueue;
                if (parseEventuallyQueue2 == null || (zIsLocalDatastoreEnabled && (parseEventuallyQueue2 instanceof ParseCommandCache))) {
                    checkContext();
                    parseHttpClientRestClient = ParsePlugins.get().restClient();
                    if (zIsLocalDatastoreEnabled) {
                        parseCommandCache = new ParsePinningEventuallyQueue(context, parseHttpClientRestClient);
                    } else {
                        parseCommandCache = new ParseCommandCache(context, parseHttpClientRestClient);
                    }
                    eventuallyQueue = parseCommandCache;
                    if (zIsLocalDatastoreEnabled && ParseCommandCache.getPendingCount() > 0) {
                        new ParseCommandCache(context, parseHttpClientRestClient);
                    }
                } else if (!zIsLocalDatastoreEnabled && (parseEventuallyQueue2 instanceof ParsePinningEventuallyQueue)) {
                    checkContext();
                    parseHttpClientRestClient = ParsePlugins.get().restClient();
                    if (zIsLocalDatastoreEnabled) {
                        parseCommandCache = new ParsePinningEventuallyQueue(context, parseHttpClientRestClient);
                    } else {
                        parseCommandCache = new ParseCommandCache(context, parseHttpClientRestClient);
                    }
                    eventuallyQueue = parseCommandCache;
                    if (zIsLocalDatastoreEnabled) {
                        new ParseCommandCache(context, parseHttpClientRestClient);
                    }
                }
                parseEventuallyQueue = eventuallyQueue;
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseEventuallyQueue;
    }
}
