def main(graph) {
    sh script: '''
      istioctl manifest apply -f profiles/snd.yml
    '''
}
return this