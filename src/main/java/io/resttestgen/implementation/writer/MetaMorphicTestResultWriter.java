package io.resttestgen.implementation.writer;

import com.google.gson.GsonBuilder;
import io.resttestgen.core.helper.jsonserializer.TestSequenceSerializer;
import io.resttestgen.core.testing.TestSequence;
import io.resttestgen.core.testing.Writer;
import io.resttestgen.implementation.metamorphic.MetaMorphicTestResult;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MetaMorphicTestResultWriter extends Writer {
    private String metaMorphicTestStrategy;

    public MetaMorphicTestResultWriter(TestSequence testSequence, String metaMorphicTestStrategy){
        super(testSequence);
        this.metaMorphicTestStrategy = metaMorphicTestStrategy;
    }

    @Override
    public String getOutputFormatName() {
        return "Report";
    }

    @Override
    public void write() throws IOException {
        File file = new File(getMetaMorphicTestResultOutPutPAth(metaMorphicTestStrategy));

        file.mkdirs();

        FileWriter writer = new FileWriter(getMetaMorphicTestResultOutPutPAth(metaMorphicTestStrategy) +
                getSuggestedFileName(".json"));
        // Convert map to JSON File
        //new GsonBuilder().setPrettyPrinting().create().toJson(testSequence, writer);
        new GsonBuilder().registerTypeAdapter(TestSequence.class, new TestSequenceSerializer()).setPrettyPrinting().create().toJson(testSequence,writer);

        // Close the writer
        writer.close();
    }
}
