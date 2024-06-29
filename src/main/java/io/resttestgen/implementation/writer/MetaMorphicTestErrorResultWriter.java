package io.resttestgen.implementation.writer;

import com.google.gson.GsonBuilder;
import io.resttestgen.core.helper.jsonserializer.TestSequenceSerializer;
import io.resttestgen.core.testing.TestSequence;
import io.resttestgen.core.testing.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MetaMorphicTestErrorResultWriter extends Writer {
    private String metaMorphicTestStrategy;
    private String operatorName;

    public MetaMorphicTestErrorResultWriter(TestSequence testSequence, String metaMorphicTestStrategy,String operatorName){
        super(testSequence);
        this.metaMorphicTestStrategy = metaMorphicTestStrategy;
        this.operatorName = operatorName;
    }

    @Override
    public String getOutputFormatName() {
        return "Report";
    }

    @Override
    public void write() throws IOException {
        File file = new File(getMetaMorphicTestErrorResultOutPutPAth(metaMorphicTestStrategy,operatorName));

        file.mkdirs();

        FileWriter writer = new FileWriter(
                getMetaMorphicTestErrorResultOutPutPAth(metaMorphicTestStrategy,operatorName) +
                getSuggestedFileName(".json"));
        // Convert map to JSON File
        //new GsonBuilder().setPrettyPrinting().create().toJson(testSequence, writer);
        new GsonBuilder().registerTypeAdapter(
                TestSequence.class, new TestSequenceSerializer()).setPrettyPrinting().create().toJson(testSequence,writer);

        // Close the writer
        writer.close();
    }
}
