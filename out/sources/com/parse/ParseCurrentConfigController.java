package com.parse;

import com.parse.boltsinternal.Task;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseCurrentConfigController {
    ParseConfig currentConfig;
    private File currentConfigFile;
    private final Object currentConfigMutex = new Object();

    public ParseCurrentConfigController(File file) {
        this.currentConfigFile = file;
    }

    public Task<ParseConfig> getCurrentConfigAsync() {
        return Task.call(new Callable<ParseConfig>() { // from class: com.parse.ParseCurrentConfigController.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ParseConfig call() {
                synchronized (ParseCurrentConfigController.this.currentConfigMutex) {
                    try {
                        ParseCurrentConfigController parseCurrentConfigController = ParseCurrentConfigController.this;
                        if (parseCurrentConfigController.currentConfig == null) {
                            ParseConfig fromDisk = parseCurrentConfigController.getFromDisk();
                            ParseCurrentConfigController parseCurrentConfigController2 = ParseCurrentConfigController.this;
                            if (fromDisk == null) {
                                fromDisk = new ParseConfig();
                            }
                            parseCurrentConfigController2.currentConfig = fromDisk;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return ParseCurrentConfigController.this.currentConfig;
            }
        }, ParseExecutors.io());
    }

    public ParseConfig getFromDisk() {
        try {
            return ParseConfig.decode(ParseFileUtils.readFileToJSONObject(this.currentConfigFile), ParseDecoder.get());
        } catch (IOException | JSONException unused) {
            return null;
        }
    }

    public void saveToDisk(ParseConfig parseConfig) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params", (JSONObject) NoObjectsEncoder.get().encode(parseConfig.getParams()));
            try {
                ParseFileUtils.writeJSONObjectToFile(this.currentConfigFile, jSONObject);
            } catch (IOException unused) {
            }
        } catch (JSONException unused2) {
            throw new RuntimeException("could not serialize config to JSON");
        }
    }

    public Task<Void> setCurrentConfigAsync(final ParseConfig parseConfig) {
        return Task.call(new Callable<Void>() { // from class: com.parse.ParseCurrentConfigController.1
            @Override // java.util.concurrent.Callable
            public Void call() {
                synchronized (ParseCurrentConfigController.this.currentConfigMutex) {
                    ParseCurrentConfigController parseCurrentConfigController = ParseCurrentConfigController.this;
                    ParseConfig parseConfig2 = parseConfig;
                    parseCurrentConfigController.currentConfig = parseConfig2;
                    parseCurrentConfigController.saveToDisk(parseConfig2);
                }
                return null;
            }
        }, ParseExecutors.io());
    }
}
