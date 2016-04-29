require 'fileutils'
require_relative '../error_logger'

module LanguageExecutor
  class BaseLanguageExecutor
    def test_snippet(path)
      Dir.glob("#{path}**") do |file|
        ErrorLogger.instance.add_error(file) unless execute(file)
      end
    end

    private

    def execute(file)
      raise 'this method must be implemented in child clases'
    end

    def execute_with_suppressed_output(command)
      system("#{command} > /dev/null 2>&1")
    end
  end
end
